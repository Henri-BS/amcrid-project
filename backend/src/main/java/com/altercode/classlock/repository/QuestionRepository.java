package com.altercode.classlock.repository;

import org.springframework.data.domain.Sort.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Question;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	Streamable<Order> findResultById(Long id);

}
