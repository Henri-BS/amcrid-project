package com.altercode.classlock.dto;

import java.io.Serial;
import java.io.Serializable;

import com.altercode.classlock.entity.Conquest;
import com.altercode.classlock.entity.User;

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

    public ConquestDTO() {
    }

    public ConquestDTO(Conquest entity) {
        id = entity.getId();
        principalQuest = entity.getPrincipalQuest();
        secondaryQuest = entity.getSecondaryQuest();
        chapterCompleted = entity.getChapterCompleted();
        totalXp = entity.getTotalXp();
        totalBadges = entity.getTotalBadges();
        userId = entity.getUser().getId();
        userName = entity.getUser().getUserName();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getPrincipalQuest() {
        return principalQuest;
    }

    public void setPrincipalQuest(Integer principalQuest) {
        this.principalQuest = principalQuest;
    }

    public Integer getSecondaryQuest() {
        return secondaryQuest;
    }

    public void setSecondaryQuest(Integer secondaryQuest) {
        this.secondaryQuest = secondaryQuest;
    }

    public Integer getChapterCompleted() {
        return chapterCompleted;
    }

    public void setChapterCompleted(Integer chapterCompleted) {
        this.chapterCompleted = chapterCompleted;
    }

    public Integer getTotalXp() {
        return totalXp;
    }

    public void setTotalXp(Integer totalXp) {
        this.totalXp = totalXp;
    }

    public Integer getTotalBadges() {
        return totalBadges;
    }

    public void setTotalBadges(Integer totalBadges) {
        this.totalBadges = totalBadges;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
