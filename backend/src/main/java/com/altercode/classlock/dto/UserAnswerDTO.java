package com.altercode.classlock.dto;

import com.altercode.classlock.entity.UserAnswer;

import java.io.Serial;
import java.io.Serializable;

public class UserAnswerDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String answer;
    private Long questionId;
    private String userName;

    public UserAnswerDTO() {
    }

    public UserAnswerDTO(UserAnswer entity) {
        id = entity.getId();
        answer = entity.getAnswer();
        questionId = entity.getQuestion().getId();
        userName = entity.getUser().getUserName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
