package com.altercode.classlock.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "tb_question")
public class Question {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "question_id")
	private Long id;

	@Column(name = "question_title")
	private String title;

	@Column(name = "option_a")
	private String optionA;

	@Column(name = "option_b")
	private String optionB;

	@Column(name = "option_c")
	private String optionC;

	@Column(name = "option_d")
	private String optionD;

	@Column(name = "option_e")
	private String optionE;
	
	private Integer ans;
	private Integer chose;

@ManyToOne
@JoinColumn(name = "chapter_id")
private Chapter chapter;

	public Question() {

	}

	public Question(Long id, String title, String optionA, String optionB, String optionC, String optionD,
			String optionE, Integer ans, Integer chose) {
		this.id = id;
		this.title = title;
		this.optionA = optionA;
		this.optionB = optionB;
		this.optionC = optionC;
		this.optionD = optionD;
		this.optionE = optionE;
		this.ans = ans;
		this.chose = chose;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getOptionA() {
		return optionA;
	}

	public void setOptionA(String optionA) {
		this.optionA = optionA;
	}

	public String getOptionB() {
		return optionB;
	}

	public void setOptionB(String optionB) {
		this.optionB = optionB;
	}

	public String getOptionC() {
		return optionC;
	}

	public void setOptionC(String optionC) {
		this.optionC = optionC;
	}

	public String getOptionD() {
		return optionD;
	}

	public void setOptionD(String optionD) {
		this.optionD = optionD;
	}

	public String getOptionE() {
		return optionE;
	}

	public void setOptionE(String optionE) {
		this.optionE = optionE;
	}

	public Integer getAns() {
		return ans;
	}

	public void setAns(Integer ans) {
		this.ans = ans;
	}

	public Integer getChose() {
		return chose;
	}

	public void setChose(Integer chose) {
		this.chose = chose;
	}
}
