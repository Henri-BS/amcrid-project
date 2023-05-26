package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Question;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class QuestionDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private Integer correctChoice;
    private Long quizId;

    public QuestionDTO(Question entity) {
        id = entity.getId();
        title = entity.getTitle();
        correctChoice = entity.getCorrectChoice();
        quizId = entity.getQuiz().getId();
    }
}


