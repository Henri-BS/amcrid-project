package com.altercode.classlock.dto.post;

import com.altercode.classlock.entity.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@NoArgsConstructor
@Getter
@Setter
public class PostDTO implements Serializable {
	public static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String summary;
	private Integer views;
	private String body;
	private String image;
	private String createdBy;
	private LocalDateTime createdDate;

	private Long userId;
	private String userName;

	public PostDTO(Post entity) {
		id = entity.getId();
		title = entity.getTitle();
		summary = entity.getSummary();
		views = entity.getViews();
		body = entity.getBody();
		image = entity.getImage();
		createdBy = entity.getCreatedBy();
		createdDate = entity.getCreatedDate();
		userId = entity.getUser().getId();
		userName = entity.getUser().getUserName();
	}
}
