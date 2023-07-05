package com.altercode.classlock.controller;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.game.Quiz;
import com.altercode.classlock.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public ResponseEntity<Page<QuestionDTO>> findQuestionsByQuiz(Pageable pageable, @PathVariable Quiz quiz) {
        Page<QuestionDTO> page = questionService.findQuestionsByQuiz(pageable, quiz);
        return ResponseEntity.ok(page);
    }

    @PostMapping("/add")
    public ResponseEntity<QuestionDTO> saveQuestion(@RequestBody QuestionDTO dto) {
        QuestionDTO add = questionService.saveQuestion(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<QuestionDTO> updateQuestion(@RequestBody QuestionDTO dto) {
        QuestionDTO edit = questionService.updateQuestion(dto);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(value = HttpStatus.NO_CONTENT, reason = "Questão Deletada")
    public void deleteQuestion(@PathVariable Long id) {
        this.questionService.deleteQuestion(id);
    }
}
