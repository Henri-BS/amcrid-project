package com.altercode.classlock.controller.post;


import com.altercode.classlock.entity.post.Post;
import com.altercode.classlock.dto.post.CommentDTO;
import com.altercode.classlock.service.post.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/comment")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping("/list-by-user/{user}")
    public ResponseEntity<Page<CommentDTO>> findAllCommentsByPost(Pageable pageable, @PathVariable Post post) {
        Page<CommentDTO> page = commentService.findAllByPost(pageable, post);
        return ResponseEntity.ok(page);
    }

    @GetMapping("/{id}")
    public ResponseEntity<CommentDTO> findCommentById(@PathVariable Long id) {
        CommentDTO find = commentService.findById(id);
        return ResponseEntity.ok(find);
    }
}