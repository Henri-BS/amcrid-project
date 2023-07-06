package com.altercode.classlock.dto.game;

import com.altercode.classlock.entity.game.UserAnswer;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;


@NoArgsConstructor
@Getter
@Setter
public class UserAnswerDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String answer;
    private Long questionId;
    private String userName;

    public UserAnswerDTO(UserAnswer entity) {
        id = entity.getId();
        answer = entity.getAnswer();
        questionId = entity.getQuestion().getId();
    }
}
