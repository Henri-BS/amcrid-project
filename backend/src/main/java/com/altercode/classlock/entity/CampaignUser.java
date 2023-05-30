package com.altercode.classlock.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_campaign_user")
@NoArgsConstructor
@Getter
@Setter
public class CampaignUser {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;

}
