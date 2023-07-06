package com.altercode.classlock.service;

import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.controller.campaign.entity.campaign.Badge;
import com.altercode.classlock.controller.campaign.entity.user.User;
import com.altercode.classlock.controller.campaign.entity.user.UserBadge;
import com.altercode.classlock.repository.UserBadgeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserBadgeService {

    @Autowired
    private UserBadgeRepository userBadgeRepository;

    public Page<UserRelationDTO> findAllByBadge(Pageable pageable, Badge badge) {
        Page<UserBadge> page = userBadgeRepository.findAllByBadge(pageable, badge);
        return page.map(UserRelationDTO::new);
    }

    public Page<UserRelationDTO> findAllByUser(Pageable pageable, User user) {
        Page<UserBadge> page = userBadgeRepository.findAllByUser(pageable, user);
        return page.map(UserRelationDTO::new);
    }

}
