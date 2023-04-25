package com.altercode.classlock.service;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.entity.Post;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.repository.PostRepository;
import com.altercode.classlock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class PostService {

	@Autowired
    private PostRepository postRepository;

	@Autowired
	private UserRepository userRepository;
	
	public Page<PostDTO> findAll(Pageable pageable){
    	Page<Post> result = postRepository.findAll(pageable);
		return result.map(PostDTO::new);
	}
    
    public PostDTO findById(Long id) {
    	Post result = postRepository.findById(id).orElseThrow();
		return new PostDTO(result);
    }

    public PostDTO savePost(PostDTO dto) {
		User user = userRepository.findById(dto.getUserId()).orElseThrow();

		Post add = new Post();
		add.setTitle(dto.getTitle());
		add.setSummary(dto.getSummary());
		add.setBody(dto.getBody());
		add.setImage(dto.getImage());
		add.setUser(user);
		return new PostDTO(postRepository.saveAndFlush(add));
    }
}
