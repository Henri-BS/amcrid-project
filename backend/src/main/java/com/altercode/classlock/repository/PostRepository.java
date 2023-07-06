package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.post.Post;

import com.altercode.classlock.controller.campaign.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PostRepository extends JpaRepository<Post, Long> {

    Page<Post> findAllByUser(Pageable pageable, User user);
}
