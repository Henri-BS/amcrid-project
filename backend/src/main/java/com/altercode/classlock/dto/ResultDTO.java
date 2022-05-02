package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Result;


public class ResultDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer totalCorrect = 0;

	private Long userId;
	private String userName;

	public ResultDTO(Result entity) {
		id = entity.getId();		
		totalCorrect = entity.getTotalCorrect();
		userId = entity.getUser().getId();
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

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
}
