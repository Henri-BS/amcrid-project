package com.altercode.classlock.controller.campaign.entity.user;

import javax.persistence.*;

@Entity
@Table(name = "tb_follow")
public class Follow {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="following")
    private User following;

    @ManyToOne
    @JoinColumn(name="follower")
    private User follower;

    public Follow() {};

    public Follow(User following, User follower) {
        this.following = following;
        this.follower = follower;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getFollowing() {
        return following;
    }

    public void setFollowing(User following) {
        this.following = following;
    }

    public User getFollower() {
        return follower;
    }

    public void setFollower(User follower) {
        this.follower = follower;
    }
}