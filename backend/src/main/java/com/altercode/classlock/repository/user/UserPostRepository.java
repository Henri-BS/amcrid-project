package com.altercode.classlock.repository.user;

import com.altercode.classlock.entity.user.User;
import com.altercode.classlock.entity.user.UserPost;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserPostRepository extends JpaRepository<UserPost, Long> {

    Page<UserPost> findAllByUser(Pageable pageable, User user);
}
