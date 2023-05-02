package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Result;


public class ResultDTO implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer totalCorrect;
	private Long quizId;
	private String userName;

	public ResultDTO(Result entity) {
		id = entity.getId();		
		totalCorrect = entity.getTotalCorrect();
		quizId = entity.getQuiz().getId();
		userName = entity.getUser().getUserName();
	}

	public ResultDTO() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(Integer totalCorrect) {
		this.totalCorrect = totalCorrect;
	}

	public Long getQuizId() {
		return quizId;
	}

	public void setQuizId(Long quizId) {
		this.quizId = quizId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
