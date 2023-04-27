package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Quiz;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findByQuiz(Quiz quiz);

}
