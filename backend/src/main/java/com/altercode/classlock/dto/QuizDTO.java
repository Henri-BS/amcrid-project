package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Quiz;

import java.io.Serial;
import java.io.Serializable;

public class QuizDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
    private String image;
    private Integer questionQuantity;
    private Long chapterId;

    public QuizDTO() {
    }

    public QuizDTO(Quiz entity){
        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        image = entity.getImage();
        questionQuantity = entity.getQuestionQuantity();
        chapterId = entity.getChapter().getId();
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Integer getQuestionQuantity() {
        return questionQuantity;
    }

    public void setQuestionQuantity(Integer questionQuantity) {
        this.questionQuantity = questionQuantity;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }
}
