package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

import com.altercode.classlock.entity.Comment;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CommentDTO implements Serializable{

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private String userName;
	private String body;
	private LocalDateTime createdDate;

    private Long postId;
    private Long userId;

	public CommentDTO(Comment entity) {
		id = entity.getId();
		userName = entity.getUser().getUserName();
		body = entity.getBody();
		createdDate = entity.getCreatedDate();
		postId = entity.getPost().getId();
		userId = entity.getUser().getId();
	}
}
