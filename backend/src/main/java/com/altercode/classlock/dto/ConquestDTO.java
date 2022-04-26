package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Conquest;

public class ConquestDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private Integer articleRead;
	private Integer quizzCompleted;
	private Integer chapterCompleted;
	private Integer totalXp;
	private Integer totalBadges;
	private String user;
	
	public ConquestDTO() {
	}

	public ConquestDTO(Conquest entity) {
		id = entity.getId();
		articleRead = entity.getArticleRead();
		quizzCompleted = entity.getQuizzCompleted();
		chapterCompleted = entity.getChapterCompleted();
		totalXp = entity.getTotalXp();
		totalBadges = entity.getTotalBadges();
		user = entity.getUser();
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getArticleRead() {
		return articleRead;
	}

	public void setArticleRead(Integer articleRead) {
		this.articleRead = articleRead;
	}

	public Integer getQuizzCompleted() {
		return quizzCompleted;
	}

	public void setQuizzCompleted(Integer quizzCompleted) {
		this.quizzCompleted = quizzCompleted;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
}

