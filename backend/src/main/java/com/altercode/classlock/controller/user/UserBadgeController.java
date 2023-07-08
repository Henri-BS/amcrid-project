package com.altercode.classlock.controller.user;

import com.altercode.classlock.dto.user.UserRelationDTO;
import com.altercode.classlock.entity.campaign.Badge;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.service.user.UserBadgeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user-badge")
public class UserBadgeController {

    @Autowired
    private UserBadgeService userBadgeService;

    @GetMapping("/list-by-badge/{badge}")
    public ResponseEntity<Page<UserRelationDTO>> findAllUsersByBadge(Pageable pageable, @PathVariable Badge badge) {
        Page<UserRelationDTO> page = userBadgeService.findAllByBadge(pageable, badge);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/list-by-user/{user}")
    public ResponseEntity<Page<UserRelationDTO>> findAllBadgesByUser(Pageable pageable, @PathVariable User user) {
        Page<UserRelationDTO> list = userBadgeService.findAllByUser(pageable, user);
        return ResponseEntity.ok(list);
    }

    @PostMapping("/add-user")
    public ResponseEntity<UserRelationDTO> saveUserBadge(@RequestBody UserRelationDTO dto) {
        UserRelationDTO add = userBadgeService.saveUserBadge(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }
}
