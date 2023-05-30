package com.altercode.classlock.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_campaign_badge")
@NoArgsConstructor
@Getter
@Setter
public class CampaignBadge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name= "badge_id")
    private Badge badge;
}
