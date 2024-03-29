package com.altercode.classlock.service.user;

import com.altercode.classlock.dto.user.FollowDTO;
import com.altercode.classlock.entity.user.Follow;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.repository.user.FollowRepository;
import com.altercode.classlock.repository.user.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class FollowService {

    @Autowired
    private FollowRepository followRepository;

    @Autowired
    private UserRepository userRepository;

    public Page<FollowDTO> findAllFollowers(Pageable pageable, User to) {
        Page<Follow> page = followRepository.findAllByFollower(pageable, to);
        return page.map(FollowDTO::new);
    }

    public Page<FollowDTO> findAllFollowing(Pageable pageable, User from) {
        Page<Follow> page = followRepository.findAllByFollowing(pageable, from);
        return page.map(FollowDTO::new);
    }

    public Page<FollowDTO> findAll(Pageable pageable) {
        Page<Follow> page = followRepository.findAll(pageable);
        return page.map(FollowDTO::new);
    }

    public FollowDTO saveFollow(FollowDTO dto) {
        User following = userRepository.findById(dto.getFollowing().getId()).orElseThrow();
        User follower = userRepository.findById(dto.getFollower().getId()).orElseThrow();

        Follow add = new Follow();
        add.setFollowing(following);
        add.setFollower(follower);
        return new FollowDTO(followRepository.save(add));
    }
}
