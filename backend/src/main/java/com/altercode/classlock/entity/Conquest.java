package com.altercode.classlock.entity;

import javax.persistence.*;


@Entity
@Table(name = "tb_conquest") 
public class Conquest {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "conquest_id")
	private Long id;

	@Column(name = "principal_quest")
	private Integer principalQuest;
	
	@Column(name = "secondary_quest")
	private Integer secondaryQuest;
	
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
		this.principalQuest = articleRead;
		this.secondaryQuest = quizzCompleted;
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
}
