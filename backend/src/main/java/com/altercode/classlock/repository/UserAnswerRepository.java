package com.altercode.classlock.repository;

import com.altercode.classlock.entity.game.UserAnswer;
import org.springframework.data.repository.CrudRepository;

public interface UserAnswerRepository extends CrudRepository<UserAnswer, Long> {
}
