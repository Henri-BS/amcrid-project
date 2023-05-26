package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class UserRankDTO implements Serializable{
	public static final long serialVersionUID = 1L;

	private String name;
	private Integer totalXp;	

	public UserRankDTO( User user, Integer totalXp) {
		this.name = user.getUserName();
		this.totalXp = totalXp;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getTotalXp() {
		return totalXp;
	}

	public void setTotalXp(Integer totalXp) {
		this.totalXp = totalXp;
	}
}
