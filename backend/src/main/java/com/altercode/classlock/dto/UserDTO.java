package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;

public class UserDTO implements Serializable {
	public static final long serialVersionUID = 1L;

	private Long id;
	private String email;
	private String userName;
	private String password;
	private String image;

	public UserDTO(){}

	public UserDTO(Long id) {

	}

	public UserDTO(Long id, String email, String userName, String password, String image) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.image = image;
	}

	public UserDTO(User entity) {
		id = entity.getId();
		userName = entity.getUserName();
		email = entity.getEmail();
		password = entity.getPassword();
		image = entity.getImage();
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

}
