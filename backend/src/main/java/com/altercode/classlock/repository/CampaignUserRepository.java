package com.altercode.classlock.repository;

import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.campaign.CampaignUser;
import com.altercode.classlock.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignUserRepository extends JpaRepository<CampaignUser, Long> {
    void deleteByUser(User user);

    Page<CampaignUser> findAllUsersByCampaign(Pageable pageable, Campaign campaign);

    CampaignUser findByUser(User user);

    Page<CampaignUser> findAllByUser(Pageable pageable, User user);
}
