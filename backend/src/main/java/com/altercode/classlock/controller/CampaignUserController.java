package com.altercode.classlock.controller;

import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.Badge;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.CampaignUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign-user")
public class CampaignUserController {

    @Autowired
    private CampaignUserService campaignService;

    @GetMapping("/{campaign}")
    public ResponseEntity<Page<CampaignRelationDTO>> findAllUsersByCampaign(Pageable pageable, @PathVariable Campaign campaign){
        Page<CampaignRelationDTO> page = campaignService.findAllUsersByCampaign(pageable, campaign);
        return ResponseEntity.ok(page);
    }

    @PostMapping("/add")
    public ResponseEntity<CampaignRelationDTO> addUserInCampaign(@RequestBody CampaignRelationDTO dto) {
        CampaignRelationDTO add = campaignService.addUserInCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @DeleteMapping("delete/{user}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteUserByCampaign(@PathVariable User user) {
        this.campaignService.deleteUserByCampaign(user);
    }
}
