package com.altercode.classlock.dto.campaign;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.campaign.Chapter;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ChapterDTO implements Serializable {

	@Serial
	private static final long serialVersionUID = 1L;

	private Long id;
	private String title;
	private String description;
	private String image;
	private Long campaignId;

	public ChapterDTO(Chapter entity) {
		id = entity.getId();
		title = entity.getTitle();
		description = entity.getDescription();
		image = entity.getImage();
		campaignId = entity.getCampaign().getId();
	}
}
