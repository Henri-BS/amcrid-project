package com.altercode.classlock.repository;

import com.altercode.classlock.entity.CampaignPost;
import com.altercode.classlock.entity.Post;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CampaignPostRepository extends JpaRepository<CampaignPost, Long> {
    void deleteByPost(Post post);
}
