package com.altercode.classlock.repository;

import com.altercode.classlock.controller.campaign.entity.campaign.Badge;
import com.altercode.classlock.controller.campaign.entity.user.User;
import com.altercode.classlock.controller.campaign.entity.user.UserBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBadgeRepository extends JpaRepository<UserBadge, Long> {

    Page<UserBadge> findAllByUser(Pageable pageable, User user);

    Page<UserBadge> findAllByBadge(Pageable pageable, Badge badge);
}
