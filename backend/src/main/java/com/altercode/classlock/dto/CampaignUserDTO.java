package com.altercode.classlock.dto;

import com.altercode.classlock.entity.CampaignUser;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CampaignUserDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private String userName;
    private Long campaignId;

    public CampaignUserDTO(CampaignUser entity) {
        id = entity.getId();
        userName = entity.getUser().getUserName();
        campaignId = entity.getCampaign().getId();
    }
}
