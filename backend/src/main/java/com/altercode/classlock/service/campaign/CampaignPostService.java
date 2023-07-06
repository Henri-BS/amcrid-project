package com.altercode.classlock.service.campaign;

import com.altercode.classlock.dto.campaign.CampaignRelationDTO;
import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.campaign.CampaignPost;
import com.altercode.classlock.entity.post.Post;
import com.altercode.classlock.repository.campaign.CampaignPostRepository;
import com.altercode.classlock.repository.campaign.CampaignRepository;
import com.altercode.classlock.repository.post.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CampaignPostService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private PostRepository postRepository;
    @Autowired
    private CampaignPostRepository campaignPostRepository;

    public CampaignRelationDTO addPostInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaign().getId()).orElseThrow();
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
