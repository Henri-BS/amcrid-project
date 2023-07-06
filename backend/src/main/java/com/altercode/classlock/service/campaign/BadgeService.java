package com.altercode.classlock.service.campaign;

import java.util.List;
import java.util.stream.Collectors;

import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.repository.campaign.BadgeRepository;
import com.altercode.classlock.repository.campaign.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.altercode.classlock.dto.campaign.BadgeDTO;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class BadgeService {

	@Autowired
	private BadgeRepository badgeRepository;


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

    public BadgeDTO saveBadge(BadgeDTO dto) {

		Badge add = new Badge();
		add.setName(dto.getName());
		add.setDescription(dto.getDescription());
		add.setImage(dto.getImage());
		add.setXp(dto.getXp());

		return new BadgeDTO(badgeRepository.saveAndFlush(add));
    }

	public BadgeDTO updateBadge(BadgeDTO dto) {
		Badge edit = badgeRepository.findById(dto.getId()).orElseThrow();

		edit.setId(edit.getId());
		edit.setName(dto.getName());
		edit.setDescription(dto.getDescription());
		edit.setImage(dto.getImage());
		edit.setXp(dto.getXp());
		return new BadgeDTO(badgeRepository.save(edit));
	}

	public void deleteBadge(Long id) {
		this.badgeRepository.deleteById(id);
	}
}
