package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.entity.UserBadge;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserBadgeRepository extends JpaRepository<UserBadge, Long> {

    Page<UserBadge> findAllByUser(Pageable pageable, User user);

    Page<UserBadge> findAllByBadge(Pageable pageable, Badge badge);
}
