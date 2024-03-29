package com.altercode.classlock.dto.game;

import com.altercode.classlock.entity.game.Option;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class OptionDTO {
    private Long id;
    private String choice;
    private Long questionId;
    private String questionTitle;

    public OptionDTO(Option entity) {
        id = entity.getId();
        choice = entity.getChoice();
        questionId = entity.getQuestion().getId();
        questionTitle = entity.getQuestion().getTitle();
    }
}
