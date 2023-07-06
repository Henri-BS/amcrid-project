package com.altercode.classlock.repository.campaign;

import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignRepository extends JpaRepository<Campaign, Long> {
    Page<Campaign> findAllCampaignsByUser(Pageable pageable, User user);
}
