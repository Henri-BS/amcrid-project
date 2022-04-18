package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.service.QuestionService;

@RestController
@RequestMapping("/")
public class QuestionController {

	@Autowired
	private ResultDTO resultDTO;
	@Autowired
	private QuestionService service;
	
	@GetMapping("/questions")
	public ResponseEntity<Page<QuestionDTO>> findAll(Pageable pageable) {
		Page<QuestionDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/resultDTO")
	public ResultDTO getResult() {
		return resultDTO;
	}
	
	@GetMapping("/score")
	public ResponseEntity<List<ResultDTO>> score(Model m) {
		List<ResultDTO> scoreList = service.getTopScore();
		return new ResponseEntity<>(scoreList, HttpStatus.OK);
	}
}
