package com.altercode.classlock.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.*;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;


@Service
public class QuizService {

    @Autowired
    private QuizRepository quizRepository;

    @Autowired
    private QuestionRepository questionRepository;

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private QuizBadgeRepository quizBadgeRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserAnswerRepository answerRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private ResultRepository resultRepository;


    public Page<QuizDTO> findAllQuizzes(Pageable pageable) {
        Page<Quiz> result = quizRepository.findAll(pageable);

        int questionQuantity;
        for (Quiz q : result) {
            questionQuantity = q.getQuestions().size();
            q.setQuestionQuantity(questionQuantity);
        }
        return result.map(QuizDTO::new);
    }

    public QuizDTO findQuizById(Long id) {
        Quiz find = quizRepository.findById(id).orElseThrow();
        return new QuizDTO(find);
    }



    public QuizDTO saveQuiz(QuizDTO dto) {
        Chapter chapter = chapterRepository.findById(dto.getChapterId()).orElseThrow();

        Quiz add = new Quiz();
        add.setTitle(dto.getTitle());
        add.setDescription(dto.getDescription());
        add.setImage(dto.getImage());
        add.setChapter(chapter);

        return new QuizDTO(quizRepository.saveAndFlush(add));
    }


    public QuizDTO updateQuiz(QuizDTO dto) {
        Chapter chapter = chapterRepository.findById(dto.getChapterId()).orElseThrow();
        Quiz edit = quizRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setTitle(dto.getTitle());
        edit.setDescription(dto.getDescription());
        edit.setImage(dto.getImage());
        edit.setChapter(chapter);
        return new QuizDTO(quizRepository.save(edit));
    }

    public void deleteQuiz(Long id) {
        this.quizRepository.deleteById(id);
    }


    public ResultDTO getResult(UserAnswerDTO dto) {
        Question question = questionRepository.findById(dto.getQuestionId()).orElseThrow();
        User user = userRepository.findByUserName(dto.getUserName());

        UserAnswer userAnswer = new UserAnswer();
        userAnswer.setQuestion(question);
        userAnswer.setUser(user);
        userAnswer.setAnswer(dto.getAnswer());
        answerRepository.save(userAnswer);

        Result result = resultRepository.findResultByUser(user);
        userAnswer = answerRepository.findById(userAnswer.getId()).orElseThrow();

        int totalCorrect = 0;
        int answer = Integer.parseInt(userAnswer.getAnswer());
        for(Question q : userAnswer.getQuestion().getQuiz().getQuestions()) {
        if(result == null){
            result = new Result();
            result.setUser(userAnswer.getUser());
            result.setQuiz(userAnswer.getQuestion().getQuiz());
            resultRepository.saveAndFlush(result);
        }

            if(answer == q.getCorrectChoice()){
                result.setMessage("Resposta Correta!");
                totalCorrect++;
                result.setTotalCorrect(totalCorrect);
            }else {
                result.setMessage("Resposta Incorreta, a resposta corrreta é: " + q.getCorrectChoice());
            }
        }
        return new ResultDTO(resultRepository.save(result));
    }

    public void saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setTotalCorrect(result.getTotalCorrect());
        resultRepository.save(saveResult);
    }

    public List<ResultDTO> getTopScore() {
        List<Result> scoreList = resultRepository.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
        return scoreList.stream().map(x -> new ResultDTO()).collect(Collectors.toList());
    }

}
