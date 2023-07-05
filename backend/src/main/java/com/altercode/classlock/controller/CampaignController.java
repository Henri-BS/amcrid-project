package com.altercode.classlock.controller;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.entity.User;
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
    public ResponseEntity<Page<CampaignDTO>> findAllCampaigns(Pageable pageable) {
        Page<CampaignDTO> list = campaignService.findAllCampaign(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/user/{user}")
    public ResponseEntity<Page<CampaignDTO>> findAllCampaignsByUser(Pageable pageable, @PathVariable User user) {
        Page<CampaignDTO> page = campaignService.findAllCampaignsByUser(pageable, user);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CampaignDTO> findCampaignById(@PathVariable Long id) {
        CampaignDTO find = campaignService.findCampaignById(id);
        return ResponseEntity.ok(find);
    }




    @PostMapping("/add")
    public ResponseEntity<CampaignDTO> saveCampaign(@RequestBody CampaignDTO dto) {
        CampaignDTO add = campaignService.saveCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<CampaignDTO> updateCampaign(@RequestBody CampaignDTO dto) {
        CampaignDTO edit = campaignService.updateCampaign(dto);
        return new ResponseEntity<>(edit, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteCampaign(@PathVariable Long id) {
        this.campaignService.deleteCampaign(id);
    }


}
