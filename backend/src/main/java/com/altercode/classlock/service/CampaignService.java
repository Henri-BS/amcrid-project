package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.dto.CampaignRelationDTO;
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
    public CampaignDTO updateCampaign(CampaignDTO dto) {
        Campaign edit = campaignRepository.findById(dto.getId()).orElseThrow();

        edit.setId(edit.getId());
        edit.setDescription(dto.getDescription());
        edit.setImage(dto.getImage());
        return new CampaignDTO(campaignRepository.save(edit));
    }


}
