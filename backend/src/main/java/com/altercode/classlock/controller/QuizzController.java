package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.dto.TotalCorrectSumDTO;
import com.altercode.classlock.service.QuizzService;


@RestController
@RequestMapping("/quizz")
public class QuizzController {
	
	@Autowired
	private QuizzService service;
	
	
	@GetMapping("/all-questions")
	public ResponseEntity<List<QuestionDTO>> findAll() {
		List<QuestionDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/questions")
	public ResponseEntity<Page<QuestionDTO>> findAll(Pageable pageable) {
		Page<QuestionDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public QuestionDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@GetMapping("/result/{id}")
    public ResponseEntity<ResultDTO> getResultById(@PathVariable("id") Long id) {
        ResultDTO result = service.findResultById(id);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
	
	@GetMapping("/score")
	public ResponseEntity<List<ResultDTO>> score(Model m) {
		List<ResultDTO> scoreList = service.getTopScore();
		return new ResponseEntity<>(scoreList, HttpStatus.OK);
	}

	@GetMapping("/results")
	public ResponseEntity<List<ResultDTO>> findAllResults() {
		List<ResultDTO> list = service.findAllResults();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping("/total-questions-correct")
	public ResponseEntity<List<TotalCorrectSumDTO>> totalQuestionCorrect(){
		List<TotalCorrectSumDTO> list = service.TotalQuestionsCorrect();
		return ResponseEntity.ok(list);
	}
}
