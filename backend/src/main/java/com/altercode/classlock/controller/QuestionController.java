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
import com.altercode.classlock.service.QuestionService;

@RestController
@RequestMapping("/questions")
public class QuestionController {

	private ResultDTO resultDTO;
	
	@Autowired
	private QuestionService service;
	
	@GetMapping("/all")
	public ResponseEntity<List<QuestionDTO>> findAll() {
		List<QuestionDTO> list = service.findAll();
		return ResponseEntity.ok(list);
	}
	
	@GetMapping
	public ResponseEntity<Page<QuestionDTO>> findAll(Pageable pageable) {
		Page<QuestionDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	@GetMapping(value = "/{id}")
	public QuestionDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@GetMapping("/result")
	public ResultDTO getResult() {
		return resultDTO;
	}
	
	@GetMapping("/score")
	public ResponseEntity<List<ResultDTO>> score(Model m) {
		List<ResultDTO> scoreList = service.getTopScore();
		return new ResponseEntity<>(scoreList, HttpStatus.OK);
	}
}
