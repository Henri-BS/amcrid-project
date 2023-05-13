package com.altercode.classlock.entity;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

@Entity
@Table(name = "tb_post")
@NoArgsConstructor
@Getter
@Setter
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

}
