package com.altercode.classlock.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.dto.QuestionFormDTO;
import com.altercode.classlock.dto.ResultDTO;
import com.altercode.classlock.entity.Question;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.repository.QuestionRepository;
import com.altercode.classlock.repository.ResultRepository;



@Service
public class QuestionService {
	
	@Autowired
	private QuestionRepository repository; 
	
	@Autowired
	private ResultRepository resultRepository;
	
	QuestionFormDTO questionFormDTO;
	
	public int getResult(QuestionFormDTO questionFormDTO) {
		int correct = 0;
		
		for(Question q: questionFormDTO.getQuestions())
				if(q.getAns() == q.getChose())
					correct++;
		return correct;
	}
	
	public void saveScore(Result result) {
		Result saveResult = new Result();
		saveResult.setUser(result.getUser());
		saveResult.setTotalCorrect(result.getTotalCorrect());
		resultRepository.save(saveResult);
	}
	
	public List<ResultDTO> getTopScore() {
		List<Result> scoreList = resultRepository.findAll(Sort.by(Sort.Direction.DESC, "totalCorrect"));
		return scoreList.stream().map(x -> new ResultDTO()).collect(Collectors.toList());
	}
	
	@Transactional(readOnly = true)
	public Page<QuestionDTO>findAll(Pageable pageable) {
		Page<Question> result = repository.findAll(pageable);
		Page<QuestionDTO> page = result.map(x -> new QuestionDTO(x));
		return page;
	}
}
