package com.altercode.classlock.repository;

import com.altercode.classlock.entity.Option;
import com.altercode.classlock.entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findOptionByQuestion(Question question);
}
