package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Follow;


import java.io.Serial;
import java.io.Serializable;

public class FollowDTO implements  Serializable{

    @Serial
    private final static long serialVersionUID = 1L;

    private Long id;
    private Long following;
    private Long follower;

    public FollowDTO() {
    }

    public FollowDTO(Follow entity) {
        id = entity.getId();
        following = entity.getFollowing().getId();
        follower = entity.getFollower().getId();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getFollowing() {
        return following;
    }

    public void setFollowing(Long following) {
        this.following = following;
    }

    public Long getFollower() {
        return follower;
    }

    public void setFollower(Long follower) {
        this.follower = follower;
    }
}
