package com.altercode.classlock.dto;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.altercode.classlock.entity.User;

public class UserDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;
	private String email;
	private String userName;
	private String password;
	private String image;
	private String createdBy;
	private LocalDateTime createdDate = LocalDateTime.now();
	private ResultDTO result;

	public UserDTO() {

	}

	public UserDTO(Long id, String email, String userName, String password, String image, String createdBy,
			LocalDateTime createdDate, ResultDTO result) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.image = image;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.result = result;
	}

	public UserDTO(User entity) {
		id = entity.getId();
		email = entity.getEmail();
		userName = entity.getUserName();
		password = entity.getPassword();
		image = entity.getImage();
		createdBy = entity.getCreatedBy();
		createdDate = entity.getCreatedDate();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public ResultDTO getResult() {
		return result;
	}

	public void setResult(ResultDTO result) {
		this.result = result;
	}
}
