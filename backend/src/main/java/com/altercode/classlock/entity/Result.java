package com.altercode.classlock.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_result")
public class Result {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "result_id")
	private Long id;

	private Integer totalCorrect = 0;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	@OneToMany(mappedBy = "result")
	private Set<Badge> badges;
	
	public Result() {

	}

	public Result(Long id, Integer totalCorrect, User user, Set<Badge> badges) {
		super();
		this.id = id;
		this.totalCorrect = totalCorrect;
		this.user = user;
		this.badges = badges;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<Badge> getBadges() {
		return badges;
	}

	public void setBadges(Set<Badge> badges) {
		this.badges = badges;
	}
}
