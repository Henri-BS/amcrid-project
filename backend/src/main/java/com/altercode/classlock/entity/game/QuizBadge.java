package com.altercode.classlock.entity.game;

import com.altercode.classlock.entity.campaign.Badge;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_quiz_badge")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class QuizBadge {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer count;

    @Column(name = "conquest_date")
    private LocalDateTime conquestDate = LocalDateTime.now();

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;

    @ManyToOne
    @JoinColumn(name = "badge_id")
    private Badge badge;

}
