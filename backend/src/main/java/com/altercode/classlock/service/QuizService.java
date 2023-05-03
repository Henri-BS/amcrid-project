package com.altercode.classlock.service;

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
    private UserRepository userRepository;

    @Autowired
    private UserAnswerRepository answerRepository;

    @Autowired
    private OptionRepository optionRepository;

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

        Quiz quiz = quizRepository.findById(userAnswer.getQuestion().getQuiz().getId()).orElseThrow();
        Result result = resultRepository.findResultByUser(user);

        int totalCorrect = 0;
        int answer = Integer.parseInt(dto.getAnswer());
        for(Question q : userAnswer.getQuestion().getQuiz().getQuestions()) {
            String correctAnswerMessage = "Resposta Correta!";
            String incorrectAnswerMessage = "Resposta Incorreta, a resposta corrreta é: " + q.getCorrectChoice();
            if(answer == q.getCorrectChoice()){
                totalCorrect++;
                result.setMessage(correctAnswerMessage);
            }else {
                result.setMessage(incorrectAnswerMessage);
            }
        }

        if(result == null){
            result = new Result();
            result.setUser(user);
            result.setQuiz(quiz);
            resultRepository.saveAndFlush(result);
        }

        result.setTotalCorrect(totalCorrect);
        result.setQuiz(quiz);
        result.setUser(user);
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

    public List<QuestionDTO> findAll() {
        List<Question> result = questionRepository.findAll();
        return result.stream().map(QuestionDTO::new).collect(Collectors.toList());
    }

    public List<QuestionDTO> findByQuiz(Quiz quiz) {
        List<Question> result = questionRepository.findByQuiz(quiz);
        return result.stream().map(QuestionDTO::new).collect(Collectors.toList());
    }

    public Page<QuestionDTO> findAll(Pageable pageable) {
        Page<Question> result = questionRepository.findAll(pageable);
        return result.map(QuestionDTO::new);
    }

    public QuestionDTO findById(Long id) {
        Question question = questionRepository.findById(id).orElseThrow();
        return new QuestionDTO(question);
    }

    public ResultDTO findResultById(Long id) {
        return resultRepository.findResultById(id);
    }

    public List<ResultDTO> findAllResults() {
        List<Result> result = resultRepository.findAll();
        return result.stream().map(ResultDTO::new).collect(Collectors.toList());
    }



}
