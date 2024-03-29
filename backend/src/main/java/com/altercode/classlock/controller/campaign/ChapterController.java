package com.altercode.classlock.controller.campaign;

import java.util.List;

import com.altercode.classlock.entity.campaign.Campaign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.campaign.ChapterDTO;
import com.altercode.classlock.service.campaign.ChapterService;

@RestController
@RequestMapping("/chapter")

public class ChapterController {
	@Autowired
	private ChapterService chapterService;

	@GetMapping
	public Page<ChapterDTO> findAllChapters(Pageable pageable) {
		return chapterService.findAll(pageable);
	}

	@GetMapping("/list-by-campaign/{campaign}")
	public ResponseEntity<List<ChapterDTO>> findAllChaptersByCampaign(@PathVariable Campaign campaign) {
		List<ChapterDTO> list =  chapterService.findAllChaptersByCampaign(campaign);
		return ResponseEntity.ok(list);
	}

	@GetMapping("/{id}")
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
