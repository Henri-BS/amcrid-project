package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.controller.campaign.entity.campaign.Chapter;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    List<Chapter> findAllChaptersByCampaign(Campaign campaign);
}
