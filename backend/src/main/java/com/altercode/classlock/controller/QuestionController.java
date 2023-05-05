package com.altercode.classlock.controller;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/{id}")
    public ResponseEntity<QuestionDTO> findQuestionById(@PathVariable Long id) {
        QuestionDTO find = questionService.findQuestionById(id);
        return ResponseEntity.ok(find);

    }

    @GetMapping("/quiz/{quiz}")
    public ResponseEntity<List<QuestionDTO>> findQuestionsByQuiz(@PathVariable Quiz quiz) {
        List<QuestionDTO> list = questionService.findQuestionsByQuiz(quiz);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add")
    public ResponseEntity<QuestionDTO> saveQuestion(@RequestBody QuestionDTO dto) {
        QuestionDTO add = questionService.saveQuestion(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
}
