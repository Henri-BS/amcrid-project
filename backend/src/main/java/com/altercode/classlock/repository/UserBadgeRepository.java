package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.entity.QuizBadge;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.entity.UserBadge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserBadgeRepository extends JpaRepository<UserBadge, Long> {

    List<UserBadge> findAllBadgesByUser(User user);
}
