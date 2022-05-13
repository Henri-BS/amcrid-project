package com.altercode.classlock.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.altercode.classlock.entity.Comment;

public class CommentDTO implements Serializable{
	public static final long serialVersionUID = 1L;

	private Long id;
	private String userName;
	private String body;
	private LocalDateTime createdDate;

    private Long postId;
    private Long userId;

    public CommentDTO() {

    }

	public CommentDTO(Long id, String body, LocalDateTime createdDate, PostDTO post, UserDTO user) {
		this.id = id;
		this.body = body;
		this.createdDate = createdDate;
	}

	public CommentDTO(Comment entity) {
		id = entity.getId();
		userName = entity.getUser().getUserName();
		body = entity.getBody();
		createdDate = entity.getCreatedDate();
		postId = entity.getPost().getId();
		userId = entity.getUser().getId();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getBody() {
		return body;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

	public Long getPostId() {
		return postId;
	}

	public void setPostId(Long postId) {
		this.postId = postId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}
}
