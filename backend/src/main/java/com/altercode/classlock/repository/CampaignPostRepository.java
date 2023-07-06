package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.campaign.Campaign;
import com.altercode.classlock.controller.campaign.entity.campaign.CampaignPost;
import com.altercode.classlock.controller.campaign.entity.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignPostRepository extends JpaRepository<CampaignPost, Long> {
    void deleteByPost(Post post);

    Page<CampaignPost> findAllPostersByCampaign(Pageable pageable, Campaign campaign);
}
