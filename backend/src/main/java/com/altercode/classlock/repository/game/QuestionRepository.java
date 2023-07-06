package com.altercode.classlock.repository.game;

import com.altercode.classlock.entity.game.Quiz;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.game.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	Page<Question> findByQuiz(Pageable pageable, Quiz quiz);

}
