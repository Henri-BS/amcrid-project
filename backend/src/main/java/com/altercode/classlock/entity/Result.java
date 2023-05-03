package com.altercode.classlock.entity;

import javax.persistence.*;


@Entity
@Table(name = "tb_result")
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

	@OneToOne
	@JoinColumn(name = "user_id")
	private User user;
		
	public Result() {

	}

	public Result(Long id, String message, Integer totalCorrect, User user) {
		this.id = id;
		this.message = message;
		this.totalCorrect = totalCorrect;
		this.user = user;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Integer getTotalCorrect() {
		return totalCorrect;
	}

	public void setTotalCorrect(Integer totalCorrect) {
		this.totalCorrect = totalCorrect;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Quiz getQuiz() {
		return quiz;
	}

	public void setQuiz(Quiz quiz) {
		this.quiz = quiz;
	}
}
