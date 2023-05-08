package com.altercode.classlock.dto;

import com.altercode.classlock.entity.QuizBadge;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class QuizBadgeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer count;
    private LocalDateTime conquestDate;
    private Long quizId;
    private String badgeName;

    public QuizBadgeDTO() {
    }

    public QuizBadgeDTO(QuizBadge entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        quizId = entity.getQuiz().getId();
        badgeName = entity.getBadge().getName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getConquestDate() {
        return conquestDate;
    }

    public void setConquestDate(LocalDateTime conquestDate) {
        this.conquestDate = conquestDate;
    }

    public Long getQuizId() {
        return quizId;
    }

    public void setQuizId(Long quizId) {
        this.quizId = quizId;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }
}
