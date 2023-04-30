package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Result;


public class ResultDTO implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer totalCorrect = 0;

	public ResultDTO(Result entity) {
		id = entity.getId();		
		totalCorrect = entity.getTotalCorrect();
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


}
