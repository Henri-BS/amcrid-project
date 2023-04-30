package com.altercode.classlock.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Option {

    @Id
    private Long id;
    private String choice;
    private Boolean correct;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Option() {
    }

    public Option(Long id, String choice, Boolean correct, Question question) {
        this.id = id;
        this.choice = choice;
        this.correct = correct;
        this.question = question;
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

    public Boolean getCorrect() {
        return correct;
    }

    public void setCorrect(Boolean correct) {
        this.correct = correct;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
