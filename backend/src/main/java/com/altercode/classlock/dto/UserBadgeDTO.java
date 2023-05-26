package com.altercode.classlock.dto;

import com.altercode.classlock.entity.QuizBadge;
import com.altercode.classlock.entity.UserBadge;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDateTime;


@NoArgsConstructor
@Getter
@Setter
public class UserBadgeDTO implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private Long id;
    private Integer count;
    private LocalDateTime conquestDate;
    private Long userId;
    private String badgeName;
    private String badgeImage;

    public UserBadgeDTO(UserBadge entity) {
        id = entity.getId();
        count = entity.getCount();
        conquestDate = entity.getConquestDate();
        userId = entity.getUser().getId();
        badgeName = entity.getBadge().getName();
        badgeImage = entity.getBadge().getImage();
    }
}
