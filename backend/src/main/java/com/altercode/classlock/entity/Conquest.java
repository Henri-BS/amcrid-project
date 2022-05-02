package com.altercode.classlock.entity;

import javax.persistence.*;


@Entity
@Table(name = "tb_conquest") 
public class Conquest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "chapter_id")
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

	public Conquest(Long id, User user, Integer articleRead, Integer quizzCompleted, Integer chapterCompleted, Integer totalXp, Integer totalBadges) {
		this.id = id;
		this.user = user;
		this.articleRead = articleRead;
		this.quizzCompleted = quizzCompleted;
		this.chapterCompleted = chapterCompleted;
		this.totalXp = totalXp;
		this.totalBadges = totalBadges;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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
}
