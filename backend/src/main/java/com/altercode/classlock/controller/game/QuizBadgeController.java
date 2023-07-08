package com.altercode.classlock.controller.game;

import com.altercode.classlock.dto.game.QuizBadgeDTO;
import com.altercode.classlock.entity.game.Quiz;
import com.altercode.classlock.service.game.QuizBadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/quiz-badge")
public class QuizBadgeController {

    @Autowired
    private QuizBadgeService quizBadgeService;

    @GetMapping("/list-by-quiz/{quiz}")
    public ResponseEntity<List<QuizBadgeDTO>> findAllBadgesByQuiz(@PathVariable Quiz quiz) {
        List<QuizBadgeDTO> list = quizBadgeService.findAllBadgesByQuiz(quiz);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add-quiz")
    public ResponseEntity<QuizBadgeDTO> saveQuizBadge(@RequestBody QuizBadgeDTO dto) {
        QuizBadgeDTO add = quizBadgeService.saveQuizBadge(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

}
