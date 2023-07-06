package com.altercode.classlock.service.game;

import com.altercode.classlock.dto.game.QuizBadgeDTO;
import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.game.Quiz;
import com.altercode.classlock.entity.game.QuizBadge;
import com.altercode.classlock.repository.campaign.BadgeRepository;
import com.altercode.classlock.repository.game.QuizBadgeRepository;
import com.altercode.classlock.repository.game.QuizRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class QuizBadgeService {

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private QuizBadgeRepository quizBadgeRepository;

    @Autowired
    private QuizRepository quizRepository;


    public List<QuizBadgeDTO> findAllBadgesByQuiz(Quiz quiz) {
        List<QuizBadge> list = quizBadgeRepository.findAllBadgesByQuiz(quiz);
        return list.stream().map(QuizBadgeDTO::new).collect(Collectors.toList());
    }

    public QuizBadgeDTO saveQuizBadge(QuizBadgeDTO dto) {
        Quiz quiz = quizRepository.findById(dto.getQuizId()).orElseThrow();
        Badge badge = badgeRepository.findBadgeByName(dto.getBadgeName());

        QuizBadge quizbadge = new QuizBadge();
        quizbadge.setQuiz(quiz);
        quizbadge.setBadge(badge);

        return new QuizBadgeDTO(quizBadgeRepository.saveAndFlush(quizbadge));
    }


}
