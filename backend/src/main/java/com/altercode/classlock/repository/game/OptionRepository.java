package com.altercode.classlock.repository.game;

import com.altercode.classlock.entity.game.Option;
import com.altercode.classlock.entity.game.Question;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OptionRepository extends JpaRepository<Option, Long> {
    List<Option> findOptionByQuestion(Question question);


}
