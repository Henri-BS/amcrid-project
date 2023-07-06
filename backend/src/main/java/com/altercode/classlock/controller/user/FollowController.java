package com.altercode.classlock.controller.user;

import com.altercode.classlock.dto.user.FollowDTO;
import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.service.user.FollowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/follow")
public class FollowController {

    @Autowired
    private FollowService followService;

    @GetMapping("/page")
    public ResponseEntity<Page<FollowDTO>> findAll(Pageable pageable) {
        Page<FollowDTO> page = followService.findAll(pageable);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/follower/{follower}")
    public ResponseEntity<Page<FollowDTO>> findAllFollowers(Pageable pageable, @PathVariable User follower) {
        Page<FollowDTO> page = followService.findAllFollowers(pageable, follower);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/following/{following}")
    public ResponseEntity<Page<FollowDTO>> findAllFollowing(Pageable pageable, @PathVariable User following) {
        Page<FollowDTO> page = followService.findAllFollowing(pageable, following);
        return ResponseEntity.ok(page);
    }

    @PostMapping("/add")
    public ResponseEntity<FollowDTO> saveFollow(@RequestBody FollowDTO dto) {
    FollowDTO add = followService.saveFollow(dto);
    return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

}
