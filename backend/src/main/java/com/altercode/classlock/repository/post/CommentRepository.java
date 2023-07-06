package com.altercode.classlock.repository.post;

import com.altercode.classlock.controller.campaign.entity.post.Comment;
import com.altercode.classlock.controller.campaign.entity.post.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {
    Page<Comment> findAllByPost(Pageable pageable, Post post);
}
