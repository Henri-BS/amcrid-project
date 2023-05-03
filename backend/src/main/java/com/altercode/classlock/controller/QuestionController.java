package com.altercode.classlock.controller;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @GetMapping("/quiz/{quiz}")
    public ResponseEntity<List<QuestionDTO>> findQuestionsByQuiz(@PathVariable Quiz quiz) {
        List<QuestionDTO> list = questionService.findQuestionsByQuiz(quiz);
        return ResponseEntity.ok(list);
    }
}
