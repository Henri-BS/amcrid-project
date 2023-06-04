package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CampaignService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private CampaignUserRepository campaignUserRepository;

    @Autowired
    private CampaignPostRepository campaignPostRepository;

    @Autowired
    private CampaignBadgeRepository campaignBadgeRepository;

    @Transactional(readOnly = true)
      public Page<CampaignDTO> findAllCampaign(Pageable pageable) {
        Page<Campaign> page = campaignRepository.findAll(pageable);

        for(Campaign c: page){
            if(c.getImage() == null){
                c.setImage("https://www.manpingou.com/uploads/allimg/200226/25-20022613060M96.jpg");
            }
            campaignRepository.save(c);
        }

        return page.map(CampaignDTO::new);
    }

    @Transactional(readOnly = true)
    public CampaignDTO findCampaignById(Long id) {
        Campaign find = campaignRepository.findById(id).orElseThrow();
        return new CampaignDTO(find);
    }

    public CampaignDTO saveCampaign(CampaignDTO dto) {
        Campaign add = new Campaign();
        add.setName(dto.getName());
        add.setDescription(dto.getDescription());
        add.setImage(dto.getImage());
        return new CampaignDTO(campaignRepository.saveAndFlush(add));
    }

    public CampaignRelationDTO addUserInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        User user = userRepository.findByUserName(dto.getUserName());

        CampaignUser add = new CampaignUser();
        add.setCampaign(campaign);
        add.setUser(user);
        return new CampaignRelationDTO(campaignUserRepository.saveAndFlush(add));
    }

    public CampaignRelationDTO addPostInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        Post post = postRepository.findById(dto.getPostId()).orElseThrow();

        CampaignPost add = new CampaignPost();
        add.setCampaign(campaign);
        add.setPost(post);
        return new CampaignRelationDTO(campaignPostRepository.saveAndFlush(add));
    }

    public CampaignRelationDTO addBadgeInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        Badge badge = badgeRepository.findById(dto.getBadgeId()).orElseThrow();

        CampaignBadge add = new CampaignBadge();
            add.setCampaign(campaign);
            add.setBadge(badge);
            return new CampaignRelationDTO(campaignBadgeRepository.saveAndFlush(add));
    }

    public CampaignDTO updateCampaign(CampaignDTO dto) {
        Campaign edit = campaignRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setDescription(dto.getDescription());
        edit.setImage(dto.getImage());
        return new CampaignDTO(campaignRepository.save(edit));
    }

    public void deleteCampaign(Long id) {
        this.campaignRepository.deleteById(id);
    }

    public void deleteUserByCampaign(User user) {
        this.campaignUserRepository.deleteByUser(user);
    }

    public void deletePostByCampaign(Post post) {
        this.campaignPostRepository.deleteByPost(post);
    }

    public void deleteBadgeByCampaign(Badge badge) {
        this.campaignBadgeRepository.deleteBadgeByCampaign(badge);
    }

    public Page<CampaignRelationDTO> findAllBadgesInCampaign(Pageable pageable, Campaign campaign) {
        Page<CampaignBadge> page = campaignBadgeRepository.findAllBadgesInCampaign(pageable, campaign);
        return page.map(CampaignRelationDTO::new);
    }
}
