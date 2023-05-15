package com.altercode.classlock.controller;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.*;
import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.entity.QuizBadge;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

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

	@GetMapping("/chapter/{chapter}")
	public ResponseEntity<List<QuizDTO>> findQuizzesByChapter(@PathVariable Chapter chapter) {
		List<QuizDTO> list = quizService.findQuizzesByChapter(chapter);
		return ResponseEntity.ok(list);
	}

	@PostMapping("/add")
	public ResponseEntity<QuizDTO> saveQuiz(@RequestBody QuizDTO dto) {
		QuizDTO add = quizService.saveQuiz(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@PutMapping("/edit")
	public ResponseEntity<QuizDTO> updateQuiz(@RequestBody QuizDTO dto) {
		QuizDTO update = quizService.updateQuiz(dto);
		return new ResponseEntity<>(update, HttpStatus.OK);
	}

	@PutMapping("/play")
	public ResponseEntity<ResultDTO> playQuiz(@RequestBody UserAnswerDTO dto) {
		ResultDTO play = quizService.getResult(dto);
		return new ResponseEntity<>(play, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteQuiz(@PathVariable Long id) {
		this.quizService.deleteQuiz(id);
	}

	@GetMapping("/score")
	public ResponseEntity<List<ResultDTO>> score(Model m) {
		List<ResultDTO> scoreList = quizService.getTopScore();
		return new ResponseEntity<>(scoreList, HttpStatus.OK);
	}

}
