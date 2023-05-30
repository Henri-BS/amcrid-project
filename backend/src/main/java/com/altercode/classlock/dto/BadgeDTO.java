package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Badge;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@NoArgsConstructor
@Getter
@Setter
public class BadgeDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private String name;
	private String description;
	private String image;
	private Integer xp;


	public BadgeDTO(Badge entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		image = entity.getImage();
		xp = entity.getXp();
	}
}
