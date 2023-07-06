package com.altercode.classlock.entity.user;

import com.altercode.classlock.entity.campaign.Badge;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_user_badge")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class UserBadge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer count;

    @Column(name = "conquest_date")
    private LocalDateTime conquestDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "badge_id")
    private Badge badge;

}
