package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignRelationDTO;
import com.altercode.classlock.entity.*;
import com.altercode.classlock.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class CampaignUserService {
    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CampaignUserRepository campaignUserRepository;


    public CampaignRelationDTO addUserInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        User user = userRepository.findByUserName(dto.getUser().getUserName());

        CampaignUser add = new CampaignUser();
        add.setCampaign(campaign);
        add.setUser(user);
        return new CampaignRelationDTO(campaignUserRepository.saveAndFlush(add));
    }

    public void deleteUserByCampaign(User user) {

        this.campaignUserRepository.deleteByUser(user);
    }

    public Page<CampaignRelationDTO> findAllUsersByCampaign(Pageable pageable, Campaign campaign) {
        Page<CampaignUser> page = campaignUserRepository.findAllUsersByCampaign(pageable, campaign);
        return page.map(CampaignRelationDTO::new);
    }


}
