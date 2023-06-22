package com.altercode.classlock.dto;

import com.altercode.classlock.entity.UserBadge;
import com.altercode.classlock.entity.UserPost;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
public class UserRelationDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer count;
    private LocalDateTime conquestDate;
    private Long userId;
    private BadgeDTO badge;
    private PostDTO post;

    public UserRelationDTO(UserBadge entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        userId = entity.getUser().getId();
        badge = new BadgeDTO(entity.getBadge());
    }

    public UserRelationDTO(UserPost entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        userId = entity.getUser().getId();
        post = new PostDTO(entity.getPost());
    }
}
