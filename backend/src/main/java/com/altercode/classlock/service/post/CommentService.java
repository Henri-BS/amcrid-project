package com.altercode.classlock.service.post;

import com.altercode.classlock.entity.post.Comment;
import com.altercode.classlock.entity.post.Post;
import com.altercode.classlock.dto.post.CommentDTO;
import com.altercode.classlock.repository.post.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Page<CommentDTO> findAllByPost(Pageable pageable, Post post) {
        Page<Comment> page = commentRepository.findAllByPost(pageable, post);
        return page.map(CommentDTO::new);
    }

    public CommentDTO findById(Long id) {
        Comment find = commentRepository.findById(id).orElseThrow();
return new CommentDTO(find);
    }
}
