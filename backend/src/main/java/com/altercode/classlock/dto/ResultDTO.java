package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.controller.campaign.entity.game.Result;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ResultDTO implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private String message;
	private Integer totalCorrect;
	private Long quizId;

	public ResultDTO(Result entity) {
		id = entity.getId();
		message = entity.getMessage();
		totalCorrect = entity.getTotalCorrect();
		quizId = entity.getQuiz().getId();
	}
}
