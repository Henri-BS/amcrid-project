package com.altercode.classlock.service;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PostService {

	@Autowired
    private PostRepository repository;
	
    @Transactional(readOnly = true)
	public Page<PostDTO> findAll(Pageable pageable){
    	Page<Post> result = repository.findAll(pageable);
    	Page<PostDTO> page = result.map(x -> new PostDTO(x));
    	return page;
    
	}
    
    public PostDTO findById(Long id) {
    	Post result = repository.findById(id).get();
    	PostDTO dto = new PostDTO(result);
    	return dto;
    }

}
