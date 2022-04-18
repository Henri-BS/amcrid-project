package com.altercode.classlock.dto;

import java.util.List;

import com.altercode.classlock.entity.Question;

public class QuestionFormDTO {
		
	private List<Question> questions;
	
	public QuestionFormDTO(List<Question> questions) {
		this.questions = questions;
	}

	public List<Question> getQuestions() {
		return questions;
	}

	public void setQuestions(List<Question> questions) {
		this.questions = questions;
	}
}
