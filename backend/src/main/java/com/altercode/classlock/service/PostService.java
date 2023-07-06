package com.altercode.classlock.service;

import com.altercode.classlock.dto.PostDTO;
import com.altercode.classlock.controller.campaign.entity.post.Post;
import com.altercode.classlock.controller.campaign.entity.user.User;
import com.altercode.classlock.repository.PostRepository;
import com.altercode.classlock.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class PostService {

	@Autowired
    private PostRepository postRepository;

	@Autowired
	private UserRepository userRepository;
	
	public Page<PostDTO> findAll(Pageable pageable){
    	Page<Post> result = postRepository.findAll(pageable);
		return result.map(PostDTO::new);
	}

	public Page<PostDTO> findAllByUser(Pageable pageable, User user){
		Page<Post> page = postRepository.findAllByUser(pageable, user);
		return page.map(PostDTO::new);
	}
    
    public PostDTO findById(Long id) {
    	Post result = postRepository.findById(id).orElseThrow();
		if(result.getCreatedBy() == null) {
			result.setCreatedBy(result.getUser().getUserName());
		}
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

	public PostDTO updatePost(PostDTO dto) {
		User user = userRepository.findById(dto.getUserId()).orElseThrow();
		Post edit = postRepository.findById(dto.getId()).orElseThrow();

		edit.setId(edit.getId());
		edit.setTitle(dto.getTitle());
		edit.setSummary(dto.getSummary());
		edit.setBody(dto.getBody());
		edit.setImage(dto.getImage());
		edit.setUser(user);
		return new PostDTO(postRepository.save(edit));
	}

	public void deletePost(Long id) {
		this.postRepository.deleteById(id);
	}
}
