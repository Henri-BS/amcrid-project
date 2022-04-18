package com.altercode.classlock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.ChapterDTO;
import com.altercode.classlock.entity.Chapter;
import com.altercode.classlock.repository.ChapterRepository;


@Service
public class ChapterService {

	
	@Autowired
	private ChapterRepository repository;
	
	@Transactional(readOnly = true)
	public Page<ChapterDTO>findAll(Pageable pageable) {
		Page<Chapter> result = repository.findAll(pageable);
		Page<ChapterDTO> page = result.map(x -> new ChapterDTO(x));
		return page;
	}
	
	@Transactional(readOnly = true)
	public ChapterDTO findById(Long id) {
		Chapter result = repository.findById(id).get();
		ChapterDTO dto = new ChapterDTO(result);
		return dto;
	}
}
