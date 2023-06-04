package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.CampaignBadge;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignBadgeRepository extends JpaRepository<CampaignBadge, Long> {

    void deleteBadgeByCampaign(Badge badge);
}
