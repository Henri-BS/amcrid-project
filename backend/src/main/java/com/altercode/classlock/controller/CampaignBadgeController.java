package com.altercode.classlock.controller;

import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.CampaignBadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign-badge")
public class CampaignBadgeController {

    @Autowired
    private CampaignBadgeService campaignBadgeService;

    @GetMapping("/list/{campaign}")
    public ResponseEntity<Page<CampaignRelationDTO>> findAllBadgesByCampaign(Pageable pageable, @PathVariable Campaign campaign){
        Page<CampaignRelationDTO> page = campaignBadgeService.findAllBadgesByCampaign(pageable, campaign);
        return ResponseEntity.ok(page);
    }

    @PostMapping("/add-badge")
    public ResponseEntity<CampaignRelationDTO> addBadgeInCampaign(CampaignRelationDTO dto) {
        CampaignRelationDTO add = campaignBadgeService.addBadgeInCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @DeleteMapping("delete-badge/{badge}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBadgeByCampaign(@PathVariable Badge badge) {
        this.campaignBadgeService.deleteBadgeByCampaign(badge);
    }
}
