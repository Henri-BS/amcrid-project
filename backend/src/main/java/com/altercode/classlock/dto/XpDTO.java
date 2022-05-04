package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class XpDTO implements Serializable{
	public static final long serialVersionUID = 1L;

	private String name;
	private Double sum;
	


	public XpDTO(Long id, User user, Double sum) {
		this.name = user.getUserName();
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
