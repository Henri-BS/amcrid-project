package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Question;

public class QuestionDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private Integer correctChoice;

    private Long quizId;
    
    public QuestionDTO() {
    }

    public QuestionDTO(Question entity) {
        id = entity.getId();
        title = entity.getTitle();
        correctChoice = entity.getCorrectChoice();
        quizId = entity.getQuiz().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCorrectChoice() {
        return correctChoice;
    }

    public void setCorrectChoice(Integer correctChoice) {
        this.correctChoice = correctChoice;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }
}


