package com.altercode.classlock.repository;

import com.altercode.classlock.dto.CampaignUserDTO;
import com.altercode.classlock.entity.CampaignUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignUserRepository extends JpaRepository<CampaignUser, Long> {
}
