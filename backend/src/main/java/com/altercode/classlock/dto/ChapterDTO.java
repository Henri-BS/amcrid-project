package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Chapter;

public class ChapterDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String description;
	private String image;
	
	public ChapterDTO(Long id) {
		this.id = id;
	}
	
	public ChapterDTO(Chapter entity) {
		id = entity.getId();
		title = entity.getTitle();
		description = entity.getDescription();
		image = entity.getImage();
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
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
	
}
