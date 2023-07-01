package com.altercode.classlock.dto;

import com.altercode.classlock.entity.Follow;


import java.io.Serial;
import java.io.Serializable;

public class FollowDTO implements  Serializable{

    @Serial
    private final static long serialVersionUID = 1L;

    private Long id;
    private UserDTO following;
    private UserDTO follower;

    public FollowDTO() {
    }

    public FollowDTO(Follow entity) {
        id = entity.getId();
        following = new UserDTO(entity.getFollowing());
        follower = new UserDTO(entity.getFollower());
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public UserDTO getFollowing() {
        return following;
    }

    public void setFollowing(UserDTO following) {
        this.following = following;
    }

    public UserDTO getFollower() {
        return follower;
    }

    public void setFollower(UserDTO follower) {
        this.follower = follower;
    }
}
