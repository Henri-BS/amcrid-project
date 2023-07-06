package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.campaign.Badge;
import com.altercode.classlock.controller.campaign.entity.campaign.Campaign;
import com.altercode.classlock.controller.campaign.entity.campaign.CampaignBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignBadgeRepository extends JpaRepository<CampaignBadge, Long> {

    void deleteBadgeByCampaign(Badge badge);

    Page<CampaignBadge> findAllBadgesByCampaign(Pageable pageable, Campaign campaign);

}
