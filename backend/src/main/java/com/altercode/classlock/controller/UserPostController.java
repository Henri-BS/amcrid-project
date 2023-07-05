package com.altercode.classlock.controller;

import com.altercode.classlock.dto.UserRelationDTO;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.UserPostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user-post")
public class UserPostController {

    @Autowired
    private UserPostService userPostService;

    @GetMapping("/list-by-user/{user}")
    public ResponseEntity<Page<UserRelationDTO>> findAllPostersByUser(Pageable pageable, User user){
        Page<UserRelationDTO> page = userPostService.findAllByUser(pageable, user);
        return ResponseEntity.ok(page);
    }

}
