package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Result;


public class ResultDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer totalCorrect = 0;
	private String user;



	public ResultDTO() {
	}

	public ResultDTO(Result entity) {
		id = entity.getId();		
		totalCorrect = entity.getTotalCorrect();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Integer getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(Integer totalCorrect) {
		this.totalCorrect = totalCorrect;
	}


}
