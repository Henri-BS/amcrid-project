package com.altercode.classlock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne
	@JoinColumn(name = "chapter_id")
	private Chapter chapter;

	public Badge() {
		
	}
	
	public Badge(Long id, String name, String description, String image, Integer xp, Chapter chapter) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.image = image;
		this.xp = xp;
		this.chapter = chapter;
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
	

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public Integer getXp() {
		return xp;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

}
