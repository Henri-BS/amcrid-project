package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.entity.Question;

import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

	List<Question> findByChapter(Chapter chapter);

}
