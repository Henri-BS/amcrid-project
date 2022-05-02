package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Badge;

public class BadgeDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String description;
	private String image;
	private Integer xp;

	private ChapterDTO chapter;
	private UserDTO user;

	public BadgeDTO() {

	}

	public BadgeDTO(Long id, String name, String description, String image, Integer xp, ChapterDTO chapter,  UserDTO user) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.xp = xp;
		this.chapter = chapter;
		this.user = user;
	}

	public BadgeDTO(Badge entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		image = entity.getImage();
		xp = entity.getXp();
		chapter = new ChapterDTO(entity.getChapter().getId());
		user = new UserDTO(entity.getUser().getId());
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

	public ChapterDTO getChapter() {
		return chapter;
	}

	public void setChapter(ChapterDTO chapter) {
		this.chapter = chapter;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}

}
