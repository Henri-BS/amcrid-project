package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class XpDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private String userName;
	private Double sum;
	
	public XpDTO() {}

	public XpDTO(User user, Double sum) {
		this.userName = user.getUserName();
		this.sum = sum;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Double getSum() {
		return sum;
	}

	public void setSum(Double sum) {
		this.sum = sum;
	}
}
