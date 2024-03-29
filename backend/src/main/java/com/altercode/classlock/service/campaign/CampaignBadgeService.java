package com.altercode.classlock.service.campaign;

import com.altercode.classlock.dto.campaign.CampaignRelationDTO;
import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.campaign.Campaign;
import com.altercode.classlock.entity.campaign.CampaignBadge;
import com.altercode.classlock.repository.campaign.BadgeRepository;
import com.altercode.classlock.repository.campaign.CampaignBadgeRepository;
import com.altercode.classlock.repository.campaign.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CampaignBadgeService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Autowired
    private BadgeRepository badgeRepository;

    @Autowired
    private CampaignBadgeRepository campaignBadgeRepository;

    public Page<CampaignRelationDTO> findAllBadgesByCampaign(Pageable pageable, Campaign campaign) {
        Page<CampaignBadge> page = campaignBadgeRepository.findAllBadgesByCampaign(pageable, campaign);
        return page.map(CampaignRelationDTO::new);
    }

    public CampaignRelationDTO addBadgeInCampaign(CampaignRelationDTO dto) {
        Campaign campaign = campaignRepository.findById(dto.getCampaign().getId()).orElseThrow();
        Badge badge = badgeRepository.findById(dto.getBadge().getId()).orElseThrow();

        CampaignBadge add = new CampaignBadge();
        add.setCampaign(campaign);
        add.setBadge(badge);
        return new CampaignRelationDTO(campaignBadgeRepository.saveAndFlush(add));
    }

    public void deleteBadgeByCampaign(Badge badge) {
        this.campaignBadgeRepository.deleteBadgeByCampaign(badge);
    }
}
