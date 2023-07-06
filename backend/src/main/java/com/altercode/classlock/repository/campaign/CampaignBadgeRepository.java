package com.altercode.classlock.repository.campaign;

import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.campaign.CampaignBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignBadgeRepository extends JpaRepository<CampaignBadge, Long> {

    void deleteBadgeByCampaign(Badge badge);

    Page<CampaignBadge> findAllBadgesByCampaign(Pageable pageable, Campaign campaign);

}
