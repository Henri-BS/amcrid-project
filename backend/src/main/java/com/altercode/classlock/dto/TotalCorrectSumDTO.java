package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class TotalCorrectSumDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private String userName;
	private Long totalQuestions;
	
	public TotalCorrectSumDTO() {
	}

	public TotalCorrectSumDTO(User user, Long totalQuestions) {
		this.userName = user.getUserName();
		this.totalQuestions = totalQuestions;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Long getTotalQuestions() {
		return totalQuestions;
	}

	public void setTotalQuestions(Long totalQuestions) {
		this.totalQuestions = totalQuestions;
	}
	
}
