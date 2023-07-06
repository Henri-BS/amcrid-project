package com.altercode.classlock.controller.campaign.entity.user;

import com.altercode.classlock.controller.campaign.entity.campaign.Campaign;
import com.altercode.classlock.controller.campaign.entity.post.Comment;
import com.altercode.classlock.controller.campaign.entity.post.Post;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_user")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
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
	@Column(name = "user_name", unique = true , length = 50)
	private String userName;

	@Column(name = "password")
	private String password;

	@Column(name = "user_image")
	private String image;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
	private Conquest conquest;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Post> posts = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Comment> comments = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<Campaign> campaigns = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<UserBadge> userBadges = new ArrayList<>();

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	private List<UserPost> userPosters = new ArrayList<>();

	@OneToMany(mappedBy="follower", cascade = CascadeType.ALL)
	private List<Follow> followers = new ArrayList<>();

	@OneToMany(mappedBy="following", cascade = CascadeType.ALL)
	private List<Follow> following = new ArrayList<>();

}
