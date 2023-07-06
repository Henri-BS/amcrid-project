package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.user.Follow;
import com.altercode.classlock.controller.campaign.entity.user.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FollowRepository extends JpaRepository<Follow, Long> {

    Page<Follow> findAllByFollower(Pageable pageable, User follower);

    Page<Follow> findAllByFollowing(Pageable pageable, User following);

}
