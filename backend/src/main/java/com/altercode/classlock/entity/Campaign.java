package com.altercode.classlock.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "tb_campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "campaign_id")
    private Long id;

    @Column(name = "campaign_name")
    private String name;

    private String description;
    private String image;

    @OneToMany(mappedBy = "campaign")
    private List<Chapter> chapter = new ArrayList<>();

    @OneToMany(mappedBy = "campaign")
    private List<CampaignUser> campaignUsers = new ArrayList<>();

    @OneToMany(mappedBy = "campaign")
    private List<CampaignBadge> campaignBadges = new ArrayList<>();
}
