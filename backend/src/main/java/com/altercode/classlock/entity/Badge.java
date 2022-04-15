package com.altercode.classlock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_badge")
public class Badge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "badge_id")
 	private Long id;
	
	@Column(name = "badge_name")
	private String name;
	
	@Column(name = "badge_description")
	private String description;
	
	@Column(name = "badge_image")
	private String image;
 	
	@Column(name = "badge_xp")
	private Integer xp;

	public Badge(Long id, String name, String description, Integer xp) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.xp = xp;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

}
