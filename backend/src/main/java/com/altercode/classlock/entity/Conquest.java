package com.altercode.classlock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "tb_conquest")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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

}