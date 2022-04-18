package com.altercode.classlock.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;

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

	@CreatedBy
	@Column(name = "created_by", length = 50, updatable = false)
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date")
	private LocalDateTime createdDate = LocalDateTime.now();

	@OneToMany(mappedBy = "user")
	private List<Post> posts = new ArrayList<>();

	@OneToMany(mappedBy = "user")
	private List<Comment> comments = new ArrayList<>();
	
	@OneToOne(mappedBy = "userName")
	private Result result;
	
	@OneToMany(mappedBy = "id.question")
	private Set<Question> questions = new HashSet<>();

	public User() {

	}

	public User(Long id, String email, String userName, String password, String image, String createdBy,
			LocalDateTime createdDate, String lastModifiedBy, LocalDateTime lastModifiedDate, List<Post> posts,
			List<Comment> comments, Result result) {
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.password = password;
		this.image = image;
		this.createdBy = createdBy;
		this.createdDate = createdDate;
		this.posts = posts;
		this.comments = comments;
		this.result = result;
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

	public Result getResult() {
		return result;
	}

	public void setResult(Result result) {
		this.result = result;
	}
}