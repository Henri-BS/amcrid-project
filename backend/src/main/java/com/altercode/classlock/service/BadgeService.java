package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.ChapterRepository;
import com.altercode.classlock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.BadgeDTO;
import com.altercode.classlock.dto.XpDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.repository.BadgeRepository;

@Service
public class BadgeService {

	@Autowired
	private BadgeRepository badgeRepository;

	@Autowired
	private UserRepository userRepository;

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

	@Transactional(readOnly = true)
	public BadgeDTO findById(Long id) {
		Badge result = badgeRepository.findById(id).get();
		return new BadgeDTO(result);
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
}
