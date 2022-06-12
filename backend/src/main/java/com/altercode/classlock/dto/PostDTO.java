package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Post;

import java.io.Serializable;
import java.time.LocalDateTime;

public class PostDTO implements Serializable {
	public static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String summary;
	private Integer views;
	private String body;
	private String image;
	private String createdBy;
	private LocalDateTime createdDate = LocalDateTime.now();

	private UserDTO user;
	
	public PostDTO() {
	}

	public PostDTO(Post entity) {
		id = entity.getId();
		title = entity.getTitle();
		summary = entity.getSummary();
		views = entity.getViews();
		body = entity.getBody();
		image = entity.getImage();
		createdBy = entity.getCreatedBy();
		createdDate = entity.getCreatedDate();
		user = new UserDTO(entity.getUser());
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

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	public Integer getViews() {
		return views;
	}

	public void setViews(Integer views) {
		this.views = views;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public UserDTO getUser() {
		return user;
	}

	public void setUser(UserDTO user) {
		this.user = user;
	}
}
