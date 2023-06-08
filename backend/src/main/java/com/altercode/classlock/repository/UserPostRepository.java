package com.altercode.classlock.repository;

import com.altercode.classlock.entity.User;
import com.altercode.classlock.entity.UserBadge;
import com.altercode.classlock.entity.UserPost;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {

    List<UserPost> findAllPostersByUser(User user);
}
