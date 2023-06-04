package com.altercode.classlock.repository;

import com.altercode.classlock.entity.CampaignUser;
import com.altercode.classlock.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignUserRepository extends JpaRepository<CampaignUser, Long> {
    void deleteByUser(User user);
}
