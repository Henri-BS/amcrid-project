package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class XpDTO implements Serializable{
	public static final long serialVersionUID = 1L;

	private String name;
	private Long sum;
	


	public XpDTO( User user, Long sum) {
		this.name = user.getUserName();
		this.sum = sum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSum() {
		return sum;
	}

	public void setSum(Long sum) {
		this.sum = sum;
	}
}
