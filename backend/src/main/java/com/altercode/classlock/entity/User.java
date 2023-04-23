package com.altercode.classlock.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tb_user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Long id;

	@Email
	@Size(min = 5, max = 40)
	@Column(name = "email", length = 40, unique = true, nullable = false)
	private String email;

	@Size(min = 1, max = 50)
	@Column(name = "user_name", length = 50)
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "user_image")
	private String image;

	@OneToMany(mappedBy = "user")
	private List<Post> posts = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<Comment> comments = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<Badge> badges = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<Result> results = new ArrayList<>();

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Conquest conquest;

	public User() {

	}

	public User(Long id, String email, String userName, String password, String image, Conquest conquest) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.image = image;
		this.conquest = conquest;
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

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Badge> getBadges() {
		return badges;
	}

	public void setBadges(List<Badge> badges) {
		this.badges = badges;
	}

	public List<Result> getResults() {
		return results;
	}

	public void setResults(List<Result> results) {
		this.results = results;
	}

	public Conquest getConquest() {
		return conquest;
	}

	public void setConquest(Conquest conquest) {
		this.conquest = conquest;
	}
}
