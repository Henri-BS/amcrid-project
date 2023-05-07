package com.altercode.classlock.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_option")
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    //Add choiceNumber and choiceDescription attributes
    private String choice;
    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

    public Option() {
    }

    public Option(Long id, String choice, Question question) {
        this.id = id;
        this.choice = choice;
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

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }
}
