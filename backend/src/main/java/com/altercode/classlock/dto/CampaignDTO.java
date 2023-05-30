package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Campaign;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;

@NoArgsConstructor
@Getter
@Setter
public class CampaignDTO implements Serializable {

    private Long id;
    private String name;
    private String description;

    @Serial
    private static final long serialVersionUID = 1L;

    public CampaignDTO(Campaign entity) {
    id = entity.getId();
    name = entity.getName();
    description = entity.getDescription();
    }
}
