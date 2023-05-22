package com.altercode.classlock.dto;

import com.altercode.classlock.entity.QuizBadge;
import com.altercode.classlock.entity.UserBadge;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;

public class UserBadgeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer count;
    private LocalDateTime conquestDate;
    private Long userId;
    private String badgeName;
    private String badgeImage;

    public UserBadgeDTO() {
    }

    public UserBadgeDTO(UserBadge entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        userId = entity.getUser().getId();
        badgeName = entity.getBadge().getName();
        badgeImage = entity.getBadge().getImage();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public LocalDateTime getConquestDate() {
        return conquestDate;
    }

    public void setConquestDate(LocalDateTime conquestDate) {
        this.conquestDate = conquestDate;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getBadgeName() {
        return badgeName;
    }

    public void setBadgeName(String badgeName) {
        this.badgeName = badgeName;
    }

    public String getBadgeImage() {
        return badgeImage;
    }

    public void setBadgeImage(String badgeImage) {
        this.badgeImage = badgeImage;
    }
}
