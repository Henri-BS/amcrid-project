package com.altercode.classlock.service;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PostService {

    @Autowired
    private PostRepository repository;

    public List<PostDTO> findAll() {
        List<Post> result = repository.findAll();
        return result.stream().map(x -> new PostDTO(x)).collect(Collectors.toList());
    }
}
