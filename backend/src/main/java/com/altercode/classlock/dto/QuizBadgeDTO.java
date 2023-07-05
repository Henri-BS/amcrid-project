package com.altercode.classlock.dto;

import com.altercode.classlock.entity.game.QuizBadge;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class QuizBadgeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer count;
    private LocalDateTime conquestDate;
    private Long quizId;
    private String badgeName;

    public QuizBadgeDTO(QuizBadge entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        quizId = entity.getQuiz().getId();
        badgeName = entity.getBadge().getName();
    }
}
