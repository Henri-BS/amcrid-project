package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Quiz;
import com.altercode.classlock.entity.QuizBadge;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface QuizBadgeRepository extends JpaRepository<QuizBadge, Long> {
    List<QuizBadge> findAllBadgesByQuiz(Quiz quiz);
}
