package com.altercode.classlock.dto;

import com.altercode.classlock.entity.campaign.CampaignBadge;
import com.altercode.classlock.entity.campaign.CampaignPost;
import com.altercode.classlock.entity.campaign.CampaignUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CampaignRelationDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private CampaignDTO campaign;
    private UserDTO user;
    private Integer chapterQuantity;
    private Integer postQuantity;
    private PostDTO post;
    private BadgeDTO badge;

    public CampaignRelationDTO(CampaignUser entity) {
        id = entity.getId();
        user = new UserDTO(entity.getUser());
        chapterQuantity = entity.getChapterQuantity();
        postQuantity = entity.getPostQuantity();
        campaign = new CampaignDTO(entity.getCampaign());
    }

    public CampaignRelationDTO(CampaignPost entity){
        id = entity.getId();
        campaign = new CampaignDTO(entity.getCampaign());
        post = new PostDTO(entity.getPost());
    }

    public CampaignRelationDTO(CampaignBadge entity){
        id = entity.getId();
        badge = new BadgeDTO(entity.getBadge());
        campaign = new CampaignDTO(entity.getCampaign());
    }

}
