package com.altercode.classlock.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Entity
@Table(name = "tb_chapter")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Chapter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "chapter_id")
    private Long id;

    @Column(name = "chapter_title")
    private String title;

    @Column(name = "chapter_description", columnDefinition = "TEXT")
    private String description;

    @Column(name = "chapter_image")
    private String image;

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Badge> badges = new ArrayList<>();

    @OneToMany(mappedBy = "chapter", cascade = CascadeType.ALL)
    private List<Quiz> quizzes = new ArrayList<>();
}