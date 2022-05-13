package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService service;

    @GetMapping("/all")
    public ResponseEntity<List<PostDTO>> findAll() {
        List<PostDTO> list = service.findAll();
        return ResponseEntity.ok(list);
    }
}
