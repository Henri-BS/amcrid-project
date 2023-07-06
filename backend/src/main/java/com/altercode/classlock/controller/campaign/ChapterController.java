package com.altercode.classlock.controller.campaign;

import java.util.List;

import com.altercode.classlock.controller.campaign.entity.campaign.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.ChapterDTO;
import com.altercode.classlock.service.ChapterService;

@RestController
@RequestMapping("/chapter")

public class ChapterController {
	@Autowired
	private ChapterService chapterService;

	@GetMapping
	public Page<ChapterDTO> findAll(Pageable pageable) {
		return chapterService.findAll(pageable);
	}

	@GetMapping("/all")
	public ResponseEntity<List<ChapterDTO>> findAll() {
		List<ChapterDTO> list = chapterService.findAll();
		return ResponseEntity.ok(list);
	}

	@GetMapping("/campaign/{campaign}")
	public ResponseEntity<List<ChapterDTO>> findAllChaptersByCampaign(@PathVariable Campaign campaign) {
		List<ChapterDTO> list =  chapterService.findAllChaptersByCampaign(campaign);
		return ResponseEntity.ok(list);
	}

	@GetMapping(value = "/{id}")
	public ChapterDTO findById(@PathVariable Long id) {
		return chapterService.findById(id);
	}

	@PostMapping("/add")
	public ResponseEntity<ChapterDTO> saveChapter(@RequestBody ChapterDTO dto) {
		ChapterDTO add = chapterService.saveChapter(dto);
		return new ResponseEntity<>(add, HttpStatus.CREATED);
	}

	@PutMapping("/edit")
	public ResponseEntity<ChapterDTO> updateChapter(@RequestBody ChapterDTO dto) {
		ChapterDTO edit = chapterService.updateChapter(dto);
		return new ResponseEntity<>(edit, HttpStatus.OK);
	}

	@DeleteMapping("/delete/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteChapter(@PathVariable Long id) {
		this.chapterService.deleteChapter(id);
	}
}
