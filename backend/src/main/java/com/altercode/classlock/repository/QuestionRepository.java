package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

}
