package com.altercode.classlock.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.altercode.classlock.entity.Chapter;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Long> {

}
