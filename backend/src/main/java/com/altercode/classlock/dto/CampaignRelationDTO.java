package com.altercode.classlock.dto;

import com.altercode.classlock.entity.CampaignBadge;
import com.altercode.classlock.entity.CampaignPost;
import com.altercode.classlock.entity.CampaignUser;
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
    private Long campaignId;
    private UserDTO user;
    private PostDTO post;
    private BadgeDTO badge;

    public CampaignRelationDTO(CampaignUser entity) {
        id = entity.getId();
        user = new UserDTO(entity.getUser());
        campaignId = entity.getCampaign().getId();
    }

    public CampaignRelationDTO(CampaignPost entity){
        id = entity.getId();
        campaignId = entity.getCampaign().getId();
        post = new PostDTO(entity.getPost());
    }

    public CampaignRelationDTO(CampaignBadge entity){
        id = entity.getId();
        badge = new BadgeDTO(entity.getBadge());
        campaignId = entity.getCampaign().getId();
    }

}
