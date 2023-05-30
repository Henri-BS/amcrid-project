package com.altercode.classlock.controller;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.dto.CampaignUserDTO;
import com.altercode.classlock.service.CampaignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign")
public class CampaignController {

    @Autowired
    private CampaignService campaignService;

    @GetMapping("/list")
    public ResponseEntity<Page<CampaignDTO>> findAllCampaigns(Pageable pageable){
        Page<CampaignDTO> list = campaignService.findAllCampaign(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampaignDTO> findCampaignById(@PathVariable Long id){
        CampaignDTO find = campaignService.findCampaignById(id);
        return ResponseEntity.ok(find);
    }

    @PostMapping("/add-user")
    public ResponseEntity<CampaignUserDTO> saveUserInCampaign(@RequestBody CampaignUserDTO dto) {
        CampaignUserDTO add = campaignService.saveUserInCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

}
