package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class UserDTO implements Serializable {
	public static final long serialVersionUID = 1L;

	private Long id;
	private String email;
	private String userName;
	private String password;
	private String image;

	public UserDTO(User entity) {
		id = entity.getId();
		userName = entity.getUserName();
		email = entity.getEmail();
		password = entity.getPassword();
		image = entity.getImage();
	}
}
