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
	
	public BadgeDTO() {
		
	}
	
	public BadgeDTO(Badge entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		image = entity.getImage();
		xp = entity.getXp();
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
}
