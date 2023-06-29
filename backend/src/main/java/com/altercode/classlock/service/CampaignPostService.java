package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CampaignPostService {
    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CampaignPostRepository campaignPostRepository;

    public CampaignRelationDTO addPostInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        Post post = postRepository.findById(dto.getPost().getId()).orElseThrow();

        CampaignPost add = new CampaignPost();
        add.setCampaign(campaign);
        add.setPost(post);
        return new CampaignRelationDTO(campaignPostRepository.saveAndFlush(add));
    }

    public void deletePostByCampaign(Post post) {
        this.campaignPostRepository.deleteByPost(post);
    }

    public Page<CampaignRelationDTO> findAllPostersByCampaign(Pageable pageable, Campaign campaign) {
        Page<CampaignPost> page = campaignPostRepository.findAllPostersByCampaign(pageable, campaign);
        return page.map(CampaignRelationDTO::new);
    }

}