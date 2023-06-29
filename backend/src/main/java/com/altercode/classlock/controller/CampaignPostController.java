package com.altercode.classlock.controller;

import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.CampaignPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class CampaignPostController {

    @Autowired
    private CampaignPostService campaignPostService;

    @GetMapping("/posts/{campaign}")
    public ResponseEntity<Page<CampaignRelationDTO>> findAllPostersByCampaign(Pageable pageable, @PathVariable Campaign campaign) {
        Page<CampaignRelationDTO> page = campaignPostService.findAllPostersByCampaign(pageable, campaign);
        return ResponseEntity.ok(page);
    }


    @PostMapping("/add-post")
    public ResponseEntity<CampaignRelationDTO> addPostInCampaign(CampaignRelationDTO dto) {
        CampaignRelationDTO add = campaignPostService.addPostInCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @DeleteMapping("delete-post/{post}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePostByCampaign(@PathVariable Post post) {
        this.campaignPostService.deletePostByCampaign(post);
    }

}