package com.altercode.classlock.dto;

import com.altercode.classlock.entity.game.Quiz;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class QuizDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String description;
    private String image;
    private Integer questionQuantity;
    private Long chapterId;

    public QuizDTO(Quiz entity){
        id = entity.getId();
        title = entity.getTitle();
        description = entity.getDescription();
        image = entity.getImage();
        questionQuantity = entity.getQuestionQuantity();
        chapterId = entity.getChapter().getId();
    }
}
