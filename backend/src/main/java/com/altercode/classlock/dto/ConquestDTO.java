package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Conquest;

public class ConquestDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private Integer principalQuest;
	private Integer secondaryQuest;
	private Integer chapterCompleted;
	private Integer totalXp;
	private Integer totalBadges;
	
	private UserDTO user;

	public ConquestDTO() {
	}

	public ConquestDTO(Conquest entity) {
		id = entity.getId();
		principalQuest = entity.getPrincipalQuest();
		secondaryQuest = entity.getSecondaryQuest();
		chapterCompleted = entity.getChapterCompleted();
		totalXp = entity.getTotalXp();
		totalBadges = entity.getTotalBadges();
		user = new UserDTO(entity.getUser());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getPrincipalQuest() {
		return principalQuest;
	}

	public void setPrincipalQuest(Integer principalQuest) {
		this.principalQuest = principalQuest;
	}

	public Integer getSecondaryQuest() {
		return secondaryQuest;
	}

	public void setSecondaryQuest(Integer secondaryQuest) {
		this.secondaryQuest = secondaryQuest;
	}

	public Integer getChapterCompleted() {
		return chapterCompleted;
	}

	public void setChapterCompleted(Integer chapterCompleted) {
		this.chapterCompleted = chapterCompleted;
	}

	public Integer getTotalXp() {
		return totalXp;
	}

	public void setTotalXp(Integer totalXp) {
		this.totalXp = totalXp;
	}

	public Integer getTotalBadges() {
		return totalBadges;
	}

	public void setTotalBadges(Integer totalBadges) {
		this.totalBadges = totalBadges;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
