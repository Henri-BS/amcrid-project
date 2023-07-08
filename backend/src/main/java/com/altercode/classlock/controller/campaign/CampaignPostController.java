package com.altercode.classlock.controller.campaign;

import com.altercode.classlock.dto.campaign.CampaignRelationDTO;
import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.post.Post;
import com.altercode.classlock.service.campaign.CampaignPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/campaign-post")
public class CampaignPostController {

    @Autowired
    private CampaignPostService campaignPostService;

    @GetMapping("/list/{campaign}")
    public ResponseEntity<Page<CampaignRelationDTO>> findAllPostersByCampaign(Pageable pageable, @PathVariable Campaign campaign) {
        Page<CampaignRelationDTO> page = campaignPostService.findAllPostersByCampaign(pageable, campaign);
        return ResponseEntity.ok(page);
    }


    @PostMapping("/add-by-post")
    public ResponseEntity<CampaignRelationDTO> addPostInCampaign(CampaignRelationDTO dto) {
        CampaignRelationDTO add = campaignPostService.addPostInCampaign(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @DeleteMapping("delete-by-post/{post}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePostByCampaign(@PathVariable Post post) {
        this.campaignPostService.deletePostByCampaign(post);
    }

}
