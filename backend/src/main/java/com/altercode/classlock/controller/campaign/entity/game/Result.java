package com.altercode.classlock.controller.campaign.entity.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;


@Entity
@Table(name = "tb_result")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Result {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "result_id")
    private Long id;

    private String message;

    @Column(name = "total_correct")
    private Integer totalCorrect = 0;

    @ManyToOne
    @JoinColumn(name = "quiz_id")
    private Quiz quiz;



}
