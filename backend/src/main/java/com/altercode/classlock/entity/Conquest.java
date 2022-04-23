package com.altercode.classlock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_conquest") 
public class Conquest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conquest_id")
	private Long id;
	
	@Column(name = "article_read")
	private Integer articleRead;
	
	@Column(name = "quizz_completed")
	private Integer quizzCompleted;
	
	@Column(name = "chapter_completed")
	private Integer chapterCompleted;
	
	@Column(name = "total_xp")
	private Integer totalXp;
	
	@Column(name = "total_badges")
	private Integer totalBadges;
	
	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
	
	

	public Conquest() {
	}

	public Conquest(Long id, Integer articleRead, Integer quizzCompleted, Integer chapterCompleted, Integer totalXp,
			Integer totalBadges, User user) {
		this.id = id;
		this.articleRead = articleRead;
		this.quizzCompleted = quizzCompleted;
		this.chapterCompleted = chapterCompleted;
		this.totalXp = totalXp;
		this.totalBadges = totalBadges;
		this.user = user;
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

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
