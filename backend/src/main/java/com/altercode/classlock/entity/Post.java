package com.altercode.classlock.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "tb_post")
public class Post {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "post_id")
	private Long id;
	
	@Length(min = 1)
	@Column(name = "title")
	private String title;

	@Size(min = 1)
	@Column(name = "summary", columnDefinition = "TEXT")
	private String summary;

	@Column(name = "views")
	private Integer views;

	@Column(name = "body", columnDefinition = "TEXT")
	private String body;

	@Column(name = "post_image")
	private String image;

	@CreatedBy
	@Column(name = "created_by", length = 50, updatable = false)
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date")
	private LocalDateTime createdDate = LocalDateTime.now();

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	public Post() {

	}

	public Post(Long id, String title, String summary, Integer views, String body, String image, String createdBy,
			LocalDateTime createdDate, User user) {
		this.id = id;
		this.title = title;
		this.summary = summary;
		this.views = views;
		this.body = body;
		this.image = image;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.user = user;
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

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
