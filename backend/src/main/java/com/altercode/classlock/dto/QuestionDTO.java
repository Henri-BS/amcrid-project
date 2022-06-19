package com.altercode.classlock.dto;

import java.io.Serializable;

import com.altercode.classlock.entity.Question;

public class QuestionDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long id;
    private String title;
    private String optionA;
    private String optionB;
    private String optionC;
    private String optionD;
    private String optionE;
    private Integer ans;
    private Integer chose;
    
    private ChapterDTO chapter;

    public QuestionDTO(Long id, String title, String optionA, String optionB, String optionC, String optionD, String optionE, Integer ans, Integer chose, ChapterDTO chapter) {
        this.id = id;
        this.title = title;
        this.optionA = optionA;
        this.optionB = optionB;
        this.optionC = optionC;
        this.optionD = optionD;
        this.optionE = optionE;
        this.ans = ans;
        this.chose = chose;
        this.chapter = chapter;
    }

    public QuestionDTO(Question entity) {
        id = entity.getId();
        title = entity.getTitle();
        optionA = entity.getOptionA();
        optionB = entity.getOptionB();
        optionC = entity.getOptionC();
        optionD = entity.getOptionD();
        optionE = entity.getOptionE();
        ans = entity.getAns();
        chose = entity.getChose();
        chapter = new ChapterDTO(entity.getChapter());
    }

    public QuestionDTO() {
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

	public ChapterDTO getChapter() {
		return chapter;
	}

	public void setChapter(ChapterDTO chapter) {
		this.chapter = chapter;
	}
}


