package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.QuizDTO;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.dto.TotalCorrectSumDTO;
import com.altercode.classlock.repository.QuestionRepository;
import com.altercode.classlock.repository.ResultRepository;


@Service
public class QuizService {

	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private QuestionRepository questionRepository;
	
	@Autowired
	private ResultRepository resultRepository;
	
	ResultPK resultPK;

	public Page<QuizDTO> findAllQuizzes(Pageable pageable) {
		Page<Quiz> result = quizRepository.findAll(pageable);

		int questionQuantity;
		for(Quiz q : result){
			questionQuantity = q.getQuestions().size();
			q.setQuestionQuantity(questionQuantity);
		}
		return result.map(QuizDTO::new);
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
	
	public List<QuestionDTO> findByQuiz(Quiz quiz){
		List<Question> result = questionRepository.findByQuiz(quiz);
		return result.stream().map(QuestionDTO::new).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Page<QuestionDTO>findAll(Pageable pageable) {
		Page<Question> result = questionRepository.findAll(pageable);
		return result.map(QuestionDTO::new);
	}
	
	public QuestionDTO findById(Long id) {
		Question question = questionRepository.findById(id).get();
		return new QuestionDTO(question);
	}
	
	public ResultDTO findResultById(Long id) {
        return resultRepository.findResultById(id);
    }

	public List<ResultDTO> findAllResults() {
		List<Result> result = resultRepository.findAll();
		return result.stream().map(ResultDTO::new).collect(Collectors.toList());
	}
	
	public List<TotalCorrectSumDTO> TotalQuestionsCorrect(){
		return resultRepository.TotalQuestionsCorrect();
	}
}
