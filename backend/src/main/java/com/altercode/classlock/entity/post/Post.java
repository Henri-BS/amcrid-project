package com.altercode.classlock.entity.post;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.entity.user.UserPost;
import com.altercode.classlock.entity.campaign.CampaignPost;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
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
	
	@Column(name = "title")
	private String title;

	@Column(name = "summary", columnDefinition = "TEXT")
	private String summary;

	@Column(name = "views")
	private Integer views = 0;

	@Column(name = "body", columnDefinition = "TEXT")
	private String body;

	@Column(name = "post_image")
	private String image;

	@CreatedBy
	@Column(name = "created_by")
	private String createdBy;

	@CreatedDate
	@Column(name = "created_date")
	private LocalDateTime createdDate = LocalDateTime.now();

	@ManyToOne
	@JoinColumn(name = "user_id")
	private User user;

	@OneToMany(mappedBy ="post")
	private List<Comment> comments = new ArrayList<>();

	@OneToMany(mappedBy = "post")
	private List<CampaignPost> campaign = new ArrayList<>();

	@OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
	private List<UserPost> userPosters = new ArrayList<>();

}
