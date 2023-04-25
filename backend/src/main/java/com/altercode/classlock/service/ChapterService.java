package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.altercode.classlock.dto.ChapterDTO;
import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.repository.ChapterRepository;


@Service
public class ChapterService {
	
	@Autowired
	private ChapterRepository chapterRepository;
	
	public Page<ChapterDTO>findAll(Pageable pageable) {
		Page<Chapter> result = chapterRepository.findAll(pageable);
		return result.map(ChapterDTO::new);
	}

	public List<ChapterDTO> findAll() {
		List<Chapter> result = chapterRepository.findAll();
		return result.stream().map(ChapterDTO::new).collect(Collectors.toList());
	}

	public ChapterDTO findById(Long id) {
		Chapter result = chapterRepository.findById(id).orElseThrow();
		return new ChapterDTO(result);
	}

	public ChapterDTO saveChapter(ChapterDTO dto) {
		Chapter add = new Chapter();
		add.setTitle(dto.getTitle());
		add.setDescription(dto.getDescription());
		add.setImage(dto.getImage());
		return new ChapterDTO(chapterRepository.saveAndFlush(add));
	}

	public ChapterDTO updateChapter(ChapterDTO dto) {
		Chapter edit = chapterRepository.findById(dto.getId()).orElseThrow();
		edit.setId(edit.getId());
		edit.setTitle(dto.getTitle());
		edit.setDescription(dto.getDescription());
		edit.setImage(dto.getImage());
		return new ChapterDTO(chapterRepository.saveAndFlush(edit));
	}

	public void deleteChapter(Long id) {
		this.chapterRepository.deleteById(id);
	}
}
