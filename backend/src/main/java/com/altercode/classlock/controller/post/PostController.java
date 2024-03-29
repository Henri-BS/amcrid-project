package com.altercode.classlock.controller.post;


import com.altercode.classlock.entity.user.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.altercode.classlock.dto.post.PostDTO;
import com.altercode.classlock.service.post.PostService;

@RestController
@RequestMapping("/post")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping("/list")
    public ResponseEntity<Page<PostDTO>> findAll(Pageable pageable) {
        Page<PostDTO> list = postService.findAll(pageable);
        return ResponseEntity.ok(list);
    }

    @GetMapping("/list-by-user/{user}")
    public ResponseEntity<Page<PostDTO>> findAllPostersByUser(Pageable pageable, @PathVariable User user) {
        Page<PostDTO> page = postService.findAllByUser(pageable, user);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDTO> findById(@PathVariable Long id) {
        PostDTO find = postService.findById(id);
        return ResponseEntity.ok(find);
    }

    @PostMapping("/add")
    public ResponseEntity<PostDTO> savePost(@RequestBody PostDTO dto) {
        PostDTO add = postService.savePost(dto);
        return new ResponseEntity<>(add, HttpStatus.CREATED);
    }

    @PutMapping("/edit")
    public ResponseEntity<PostDTO> updatePost(@RequestBody PostDTO dto) {
        PostDTO edit = postService.updatePost(dto);
        return new ResponseEntity<>(edit, HttpStatus.OK);
    }

    @DeleteMapping("/delete/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deletePost(@PathVariable Long id) {
        this.postService.deletePost(id);
    }
}