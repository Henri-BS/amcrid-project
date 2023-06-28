package com.altercode.classlock.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_follower")
public class Follower {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name="from_user")
    private User from;

    @ManyToOne
    @JoinColumn(name="to_user")
    private User to;

    public Follower() {};

    public Follower(User from, User to) {
        this.from = from;
        this.to = to;
    }
}