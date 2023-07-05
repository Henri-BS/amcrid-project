package com.altercode.classlock.service;

import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.entity.UserPost;
import com.altercode.classlock.repository.UserPostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserPostService {

    @Autowired
    private UserPostRepository userPostRepository;

    public Page<UserRelationDTO> findAllByUser(Pageable pageable, User user){
        Page<UserPost> page = userPostRepository.findAllByUser(pageable, user);
        return page.map(UserRelationDTO::new);
    }
}
