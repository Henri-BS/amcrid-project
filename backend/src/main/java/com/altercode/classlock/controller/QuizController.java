package com.altercode.classlock.controller;

import java.util.List;

import com.altercode.classlock.dto.QuizDTO;
import com.altercode.classlock.entity.Quiz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.dto.TotalCorrectSumDTO;
import com.altercode.classlock.service.QuizService;


@RestController
@RequestMapping("/quiz")
public class QuizController {
	
	@Autowired
	private QuizService quizService;

	@GetMapping("/list")
	public ResponseEntity<Page<QuizDTO>> findAllQuizzes(Pageable pageable){
		Page<QuizDTO> page = quizService.findAllQuizzes(pageable);
		return ResponseEntity.ok(page);
	}

	@GetMapping("/{id}")
	public ResponseEntity<QuizDTO> findQuizById(@PathVariable Long id){
		QuizDTO find = quizService.findQuizById(id);
		return ResponseEntity.ok(find);
	}

	@PostMapping("/add")
	public ResponseEntity<QuizDTO> saveQuiz(@RequestBody QuizDTO dto) {
		QuizDTO add = quizService.saveQuiz(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@GetMapping("/all-questions")
	public ResponseEntity<List<QuestionDTO>> findAll() {
		List<QuestionDTO> list = quizService.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/game/{quiz}")
	public ResponseEntity<List<QuestionDTO>> findByQuiz(Quiz quiz) {
		List<QuestionDTO> list = quizService.findByQuiz(quiz);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/questions")
	public ResponseEntity<Page<QuestionDTO>> findAll(Pageable pageable) {
		Page<QuestionDTO> list = quizService.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/result/{id}")
    public ResponseEntity<ResultDTO> getResultById(@PathVariable("id") Long id) {
        ResultDTO result = quizService.findResultById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	@GetMapping("/score")
	public ResponseEntity<List<ResultDTO>> score(Model m) {
		List<ResultDTO> scoreList = quizService.getTopScore();
		return new ResponseEntity<>(scoreList, HttpStatus.OK);
	}

	@GetMapping("/results")
	public ResponseEntity<List<ResultDTO>> findAllResults() {
		List<ResultDTO> list = quizService.findAllResults();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/total-questions-correct")
	public ResponseEntity<List<TotalCorrectSumDTO>> totalQuestionCorrect(){
		List<TotalCorrectSumDTO> list = quizService.TotalQuestionsCorrect();
		return ResponseEntity.ok(list);
	}
}
