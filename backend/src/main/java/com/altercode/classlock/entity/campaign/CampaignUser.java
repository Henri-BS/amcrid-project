package com.altercode.classlock.entity.campaign;

import com.altercode.classlock.entity.User;
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

    @Column(name = "chapter_quantity")
    private Integer chapterQuantity;

    @Column(name = "post_quantity")
    private Integer postQuantity;

    @ManyToOne
    @JoinColumn(name= "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name= "user_id")
    private User user;

}
