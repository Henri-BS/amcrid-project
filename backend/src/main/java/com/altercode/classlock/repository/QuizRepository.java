package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.entity.game.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuizRepository extends JpaRepository<Quiz, Long> {

    List<Quiz> findQuizzesByChapter(Chapter chapter);
}
