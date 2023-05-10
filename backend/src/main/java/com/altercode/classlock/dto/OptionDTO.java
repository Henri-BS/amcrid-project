package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Option;


public class OptionDTO {
    private Long id;
    private String choice;
    private Long questionId;
    private String questionTitle;

    public OptionDTO() {
    }

    public OptionDTO(Option entity) {
        id = entity.getId();
        choice = entity.getChoice();
        questionId = entity.getQuestion().getId();
        questionTitle = entity.getQuestion().getTitle();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getChoice() {
        return choice;
    }

    public void setChoice(String choice) {
        this.choice = choice;
    }

    public Long getQuestionId() {
        return questionId;
    }

    public void setQuestionId(Long questionId) {
        this.questionId = questionId;
    }

    public String getQuestionTitle() {
        return questionTitle;
    }

    public void setQuestionTitle(String questionTitle) {
        this.questionTitle = questionTitle;
    }
}
