package com.altercode.classlock.repository.user;

import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.entity.user.UserBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBadgeRepository extends JpaRepository<UserBadge, Long> {

    Page<UserBadge> findAllByUser(Pageable pageable, User user);

    Page<UserBadge> findAllByBadge(Pageable pageable, Badge badge);
}
