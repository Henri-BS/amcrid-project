package com.altercode.classlock.entity.campaign;

import com.altercode.classlock.entity.post.Post;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_campaign_post")
@NoArgsConstructor
@Getter
@Setter
public class CampaignPost {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "campaign_id")
    private Campaign campaign;

    @ManyToOne
    @JoinColumn(name= "post_id")
    private Post post;
}
