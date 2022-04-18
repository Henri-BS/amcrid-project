package com.altercode.classlock.dto;

import java.io.Serializable;


public class ResultDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer totalCorrect = 0;
	
	private UserDTO user;

	public String Email;


	public ResultDTO() {
	}

	public ResultDTO(ResultDTO entity) {
		id = entity.getId();		
		totalCorrect = entity.getTotalCorrect();
	}

	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

	public Integer getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(Integer totalCorrect) {
		this.totalCorrect = totalCorrect;
	}


}
