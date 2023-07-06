package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.controller.campaign.entity.user.Conquest;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ConquestDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer principalQuest;
    private Integer secondaryQuest;
    private Integer chapterCompleted;
    private Integer totalXp;
    private Integer totalBadges;

    private Long userId;
    private String userName;
    private String userImage;

    public ConquestDTO(Conquest entity) {
        id = entity.getId();
        principalQuest = entity.getPrincipalQuest();
        secondaryQuest = entity.getSecondaryQuest();
        chapterCompleted = entity.getChapterCompleted();
        totalXp = entity.getTotalXp();
        totalBadges = entity.getTotalBadges();
        userId = entity.getUser().getId();
        userName = entity.getUser().getUserName();
        userImage = entity.getUser().getImage();
    }
}
