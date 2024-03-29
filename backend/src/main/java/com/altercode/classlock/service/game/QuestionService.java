package com.altercode.classlock.service.game;

import com.altercode.classlock.dto.game.QuestionDTO;
import com.altercode.classlock.entity.game.Question;
import com.altercode.classlock.entity.game.Quiz;
import com.altercode.classlock.repository.game.QuestionRepository;
import com.altercode.classlock.repository.game.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizRepository quizRepository;

    public QuestionDTO findQuestionById(Long id){
         Question find = questionRepository.findById(id).orElseThrow();
         return new QuestionDTO(find);
    }

    public Page<QuestionDTO> findQuestionsByQuiz(Pageable pageable, Quiz quiz) {
        Page<Question> list = questionRepository.findByQuiz(pageable, quiz);
        return list.map(QuestionDTO::new);
    }

    public QuestionDTO saveQuestion(QuestionDTO dto) {
        Quiz quiz = quizRepository.findById(dto.getQuizId()).orElseThrow();

        Question add = new Question();
        add.setQuiz(quiz);
        add.setTitle(dto.getTitle());
        add.setCorrectChoice(dto.getCorrectChoice());

        return new QuestionDTO(questionRepository.saveAndFlush(add));
    }

    public QuestionDTO updateQuestion(QuestionDTO dto) {
        Question edit = questionRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setTitle(dto.getTitle());
        edit.setCorrectChoice(dto.getCorrectChoice());
        return new QuestionDTO(questionRepository.save(edit));
    }

    public void deleteQuestion(Long id) {
        this.questionRepository.deleteById(id);
    }
}
