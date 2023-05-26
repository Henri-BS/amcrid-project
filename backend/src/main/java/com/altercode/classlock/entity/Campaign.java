package com.altercode.classlock.entity;

import javax.persistence.*;

@Entity
@Table(name = "tb_campaign")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


}
