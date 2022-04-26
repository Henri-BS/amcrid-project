package com.altercode.classlock.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "tb_result")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "result_id")
	private Long id;

	@Column(name = "total_correct")
	private Integer totalCorrect = 0;
	
	private String user;
		
	public Result() {

	}

	public Result(Long id, Integer totalCorrect, String user, List<Badge> badges) {
		this.id = id;
		this.totalCorrect = totalCorrect;
		this.user = user; 
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}
