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
    private OptionRepository optionRepository;

    @Autowired
    private ChapterRepository chapterRepository;

    @Autowired
    private ResultRepository resultRepository;

    ResultPK resultPK;

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

    public ResultDTO getResult(QuestionDTO dto) {
        Quiz quiz = quizRepository.findById(dto.getQuizId()).orElseThrow();
    Question question = questionRepository.findById(dto.getId()).orElseThrow();

    int totalCorrect = 0;
    for (int i = 0; i < quiz.getQuestions().size(); i++) {
Question q = quiz.getQuestion(i);
        for (int j = 0; j < question.getOptions().size(); j++) {
            System.out.println((j + 1) + ": " + question.getOptions().get(j));
        }
    }

    for(Option op: question.getOptions()) {
        if(op.getCorrect()) {
            System.out.println("Alternativa correta!");
            totalCorrect++;
        } else {
            System.out.println("Alternativa Incorreta!");
        }
    }
    Result result = new Result();
        result.setTotalCorrect(totalCorrect);
        return new ResultDTO(resultRepository.saveAndFlush(result));
    }

    public void saveScore(Result result) {
        Result saveResult = new Result();
        saveResult.setUser(result.getUser());
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

    public List<TotalCorrectSumDTO> TotalQuestionsCorrect() {
        return resultRepository.TotalQuestionsCorrect();
    }


}
