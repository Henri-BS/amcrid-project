package com.altercode.classlock.repository.campaign;

import com.altercode.classlock.entity.campaign.Campaign;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.campaign.Chapter;

import java.util.List;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

    List<Chapter> findAllChaptersByCampaign(Campaign campaign);
}
