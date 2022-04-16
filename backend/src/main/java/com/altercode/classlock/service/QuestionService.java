package com.altercode.classlock.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.entity.QuestionForm;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.repository.QuestionRepository;
import com.altercode.classlock.repository.ResultRepository;



@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository repository; 
	
	@Autowired
	private QuestionForm questionForm;
	
	@Autowired
	private ResultRepository resultRepository;
	
	public QuestionForm getQuestions() {
		List<Question> allQuestions = repository.findAll();
		List<Question> questionList = new ArrayList<Question>();
		
		Random random = new Random();
		
		for(int i=0; i<5; i++) {
			int rand = random.nextInt(allQuestions.size());
			questionList.add(allQuestions.get(rand));
			allQuestions.remove(rand);
		}
		
		questionForm.setQuestions(questionList);;
		
	return questionForm;
	}
	
	public int getResult(QuestionForm questionForm) {
		int correct = 0;
		
		for(Question q: questionForm.getQuestions())
				if(q.getAns() == q.getChose())
					correct++;
		return correct;
	}
	
	public void saveScore(Result result) {
		Result saveResult = new Result();
		saveResult.setUserName(result.getUserName());
		saveResult.setTotalCorrect(result.getTotalCorrect());
		resultRepository.save(saveResult);
	}
	
	public List<Result> getTopScore() {
		List<Result> scoreList = resultRepository.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
		
		return scoreList;
	}
	
	@Transactional(readOnly = true)
	public Page<QuestionDTO>findAll(Pageable pageable) {
		Page<Question> result = repository.findAll(pageable);
		Page<QuestionDTO> page = result.map(x -> new QuestionDTO(x));
		return page;
	}
}
