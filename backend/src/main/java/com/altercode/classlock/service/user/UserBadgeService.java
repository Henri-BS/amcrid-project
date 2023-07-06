package com.altercode.classlock.service.user;

import com.altercode.classlock.dto.user.UserRelationDTO;
import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.entity.user.UserBadge;
import com.altercode.classlock.repository.campaign.BadgeRepository;
import com.altercode.classlock.repository.user.UserBadgeRepository;
import com.altercode.classlock.repository.user.UserRepository;
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

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private BadgeRepository badgeRepository;

    public Page<UserRelationDTO> findAllByBadge(Pageable pageable, Badge badge) {
        Page<UserBadge> page = userBadgeRepository.findAllByBadge(pageable, badge);
        return page.map(UserRelationDTO::new);
    }

    public Page<UserRelationDTO> findAllByUser(Pageable pageable, User user) {
        Page<UserBadge> page = userBadgeRepository.findAllByUser(pageable, user);
        return page.map(UserRelationDTO::new);
    }

    public UserRelationDTO saveUserBadge(UserRelationDTO dto) {
        User user = userRepository.findById(dto.getUserId()).orElseThrow();
        Badge badge = badgeRepository.findBadgeByName(dto.getBadge().getName());

        UserBadge userBadge = new UserBadge();
        userBadge.setUser(user);
        userBadge.setBadge(badge);

        return new UserRelationDTO(userBadgeRepository.saveAndFlush(userBadge));
    }
}
