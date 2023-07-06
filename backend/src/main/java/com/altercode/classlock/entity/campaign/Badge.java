package com.altercode.classlock.entity.campaign;

import com.altercode.classlock.entity.user.UserBadge;
import com.altercode.classlock.entity.game.QuizBadge;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "tb_badge")
@NoArgsConstructor
@AllArgsConstructor
@Getter
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

	@OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
	private List<QuizBadge> quizBadges = new ArrayList<>();

	@OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
	private List<UserBadge> userBadges = new ArrayList<>();

	@OneToMany(mappedBy = "badge", cascade = CascadeType.ALL)
	private List<CampaignBadge> campaignBadges = new ArrayList<>();

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public void setXp(Integer xp) {
		this.xp = xp;
	}

}
