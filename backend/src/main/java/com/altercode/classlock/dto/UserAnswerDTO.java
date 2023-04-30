package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Question;

public class UserAnswerDTO {
    private String answer;
    private Question questionId;

    public UserAnswerDTO() {
    }

    public UserAnswerDTO(String answer) {
        this.answer = answer;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Question getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Question questionId) {
        this.questionId = questionId;
    }
}
