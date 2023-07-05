package com.altercode.classlock.entity.game;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "tb_option")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Option {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String choice;

    @ManyToOne
    @JoinColumn(name = "question_id")
    private Question question;

}
