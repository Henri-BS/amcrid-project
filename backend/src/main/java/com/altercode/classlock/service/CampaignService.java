package com.altercode.classlock.service;

import com.altercode.classlock.dto.CampaignDTO;
import com.altercode.classlock.entity.Campaign;
import com.altercode.classlock.repository.CampaignRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class CampaignService {

    @Autowired
    private CampaignRepository campaignRepository;

    @Transactional(readOnly = true)
    public Page<CampaignDTO> findAllCampaign(Pageable pageable) {
        Page<Campaign> page = campaignRepository.findAll(pageable);
        return page.map(CampaignDTO::new);
    }

    public CampaignDTO findCampaignById(Long id) {
        Campaign find = campaignRepository.findById(id).orElseThrow();
        return new CampaignDTO(find);
    }
}
