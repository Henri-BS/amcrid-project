package com.altercode.classlock.service;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.repository.QuestionRepository;
import com.altercode.classlock.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private QuizRepository quizRepository;

    public QuestionDTO findQuestionById(Long id){
         Question find = questionRepository.findById(id).orElseThrow();
         return new QuestionDTO(find);
    }

    public List<QuestionDTO> findQuestionsByQuiz(Quiz quiz) {
        List<Question> list = questionRepository.findByQuiz(quiz);
        return list.stream().map(QuestionDTO::new).collect(Collectors.toList());
    }

    public QuestionDTO saveQuestion(QuestionDTO dto) {
        Quiz quiz = quizRepository.findById(dto.getQuizId()).orElseThrow();

        Question add = new Question();
        add.setQuiz(quiz);
        add.setTitle(dto.getTitle());
        add.setCorrectChoice(dto.getCorrectChoice());

        return new QuestionDTO(questionRepository.saveAndFlush(add));
    }
}
