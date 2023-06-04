package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.entity.CampaignBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignBadgeRepository extends JpaRepository<CampaignBadge, Long> {

    void deleteBadgeByCampaign(Badge badge);

    Page<CampaignBadge> findAllBadgesInCampaign(Pageable pageable, Campaign campaign);
}
