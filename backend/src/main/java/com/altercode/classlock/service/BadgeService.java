package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.dto.QuizBadgeDTO;
import com.altercode.classlock.dto.UserBadgeDTO;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.dto.XpDTO;

@Service
public class BadgeService {

	@Autowired
	private BadgeRepository badgeRepository;

	@Autowired
	private UserBadgeRepository userBadgeRepository;

	@Autowired
	private QuizBadgeRepository quizBadgeRepository;

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private QuizRepository quizRepository;

	@Autowired
	private ChapterRepository chapterRepository;
	
	public Page<BadgeDTO>findAll(Pageable pageable) {
		Page<Badge> result = badgeRepository.findAll(pageable);
		return result.map(BadgeDTO::new);
	}

	public List<BadgeDTO> findAll() {
		List<Badge> result = badgeRepository.findAll();
		return result.stream().map(BadgeDTO::new).collect(Collectors.toList());
	}

	public BadgeDTO findById(Long id) {
		Badge result = badgeRepository.findById(id).orElseThrow();
		return new BadgeDTO(result);
	}

	public List<QuizBadgeDTO> findAllBadgesByQuiz(Quiz quiz) {
		List<QuizBadge> list = quizBadgeRepository.findAllBadgesByQuiz(quiz);
		return list.stream().map(QuizBadgeDTO::new).collect(Collectors.toList());
	}

	public List<UserBadgeDTO> findAllBadgesByUser(User user) {
		List<UserBadge> list = userBadgeRepository.findAllBadgesByUser(user);
		return list.stream().map(UserBadgeDTO::new).collect(Collectors.toList());
	}


    public BadgeDTO saveBadge(BadgeDTO dto) {
		Chapter chapter = chapterRepository.findById(dto.getChapter()).orElseThrow();

		Badge add = new Badge();
		add.setName(dto.getName());
		add.setDescription(dto.getDescription());
		add.setImage(dto.getImage());
		add.setXp(dto.getXp());
		add.setChapter(chapter);

		return new BadgeDTO(badgeRepository.saveAndFlush(add));
    }

	public QuizBadgeDTO saveQuizBadge(QuizBadgeDTO dto) {
		Quiz quiz = quizRepository.findById(dto.getQuizId()).orElseThrow();
		Badge badge = badgeRepository.findBadgeByName(dto.getBadgeName());

		QuizBadge quizbadge = new QuizBadge();
		quizbadge.setQuiz(quiz);
		quizbadge.setBadge(badge);

		return new QuizBadgeDTO(quizBadgeRepository.saveAndFlush(quizbadge));
	}

	public UserBadgeDTO saveUserBadge(UserBadgeDTO dto) {
		User user = userRepository.findById(dto.getUserId()).orElseThrow();
		Badge badge = badgeRepository.findBadgeByName(dto.getBadgeName());

		UserBadge userBadge = new UserBadge();
		userBadge.setUser(user);
		userBadge.setBadge(badge);

		return new UserBadgeDTO(userBadgeRepository.saveAndFlush(userBadge));
	}

	public BadgeDTO updateBadge(BadgeDTO dto) {
		Badge edit = badgeRepository.findById(dto.getId()).orElseThrow();
		Chapter chapter = chapterRepository.findById(dto.getChapter()).orElseThrow();

		edit.setId(edit.getId());
		edit.setName(dto.getName());
		edit.setDescription(dto.getDescription());
		edit.setImage(dto.getImage());
		edit.setXp(dto.getXp());
		edit.setChapter(chapter);
		return new BadgeDTO(badgeRepository.save(edit));
	}

	public void deleteBadge(Long id) {
		this.badgeRepository.deleteById(id);
	}


}
