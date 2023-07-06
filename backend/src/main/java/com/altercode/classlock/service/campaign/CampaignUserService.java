package com.altercode.classlock.service.campaign;

import com.altercode.classlock.dto.campaign.CampaignRelationDTO;
import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.campaign.CampaignUser;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.repository.campaign.CampaignRepository;
import com.altercode.classlock.repository.campaign.CampaignUserRepository;
import com.altercode.classlock.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class CampaignUserService {
    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private CampaignUserRepository campaignUserRepository;


    public CampaignRelationDTO addUserInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaign().getId()).orElseThrow();
        User user = userRepository.findByUserName(dto.getUser().getUserName());

        CampaignUser add = new CampaignUser();
        add.setCampaign(campaign);
        add.setUser(user);
        add.setChapterQuantity(campaign.getChapter().size());
        add.setPostQuantity(campaign.getCampaignPosts().size());
        return new CampaignRelationDTO(campaignUserRepository.saveAndFlush(add));
    }

    public Page<CampaignRelationDTO> findAllUsersByCampaign(Pageable pageable, Campaign campaign) {
        Page<CampaignUser> page = campaignUserRepository.findAllUsersByCampaign(pageable, campaign);

        return page.map(CampaignRelationDTO::new);
    }

    public CampaignRelationDTO findByUser(User user) {
        CampaignUser find = campaignUserRepository.findByUser(user);
        find.setChapterQuantity(find.getCampaign().getChapter().size());
        find.setPostQuantity(find.getCampaign().getCampaignPosts().size());
        return new CampaignRelationDTO(find);
    }

    public void deleteUserByCampaign(User user) {
        this.campaignUserRepository.deleteByUser(user);
    }

    public Page<CampaignRelationDTO> findAllByUser(Pageable pageable, User user) {
        Page<CampaignUser> page = campaignUserRepository.findAllByUser(pageable, user);
        return page.map(CampaignRelationDTO::new);
    }
}
