package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.dto.CampaignUserDTO;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.entity.CampaignUser;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.CampaignRepository;
import com.altercode.classlock.repository.CampaignUserRepository;
import com.altercode.classlock.repository.UserRepository;
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
    private CampaignUserRepository campaignUserRepository;

    @Transactional(readOnly = true)
    public Page<CampaignDTO> findAllCampaign(Pageable pageable) {
        Page<Campaign> page = campaignRepository.findAll(pageable);
        return page.map(CampaignDTO::new);
    }

    public CampaignDTO findCampaignById(Long id) {
        Campaign find = campaignRepository.findById(id).orElseThrow();
        return new CampaignDTO(find);
    }

    public CampaignUserDTO saveUserInCampaign(CampaignUserDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaignId()).orElseThrow();
        User user = userRepository.findByUserName(dto.getUserName());

        CampaignUser add = new CampaignUser();
        add.setCampaign(campaign);
        add.setUser(user);
        return new CampaignUserDTO(campaignUserRepository.saveAndFlush(add));
    }
}
