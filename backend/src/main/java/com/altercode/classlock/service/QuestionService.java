package com.altercode.classlock.service;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class QuestionService {

    @Autowired
    private QuestionRepository questionRepository;

    public List<QuestionDTO> findQuestionsByQuiz(Quiz quiz) {
        List<Question> list = questionRepository.findByQuiz(quiz);
        return list.stream().map(QuestionDTO::new).collect(Collectors.toList());
    }
}
