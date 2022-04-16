package com.altercode.classlock.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.altercode.classlock.dto.QuestionDTO;
import com.altercode.classlock.entity.QuestionForm;
import com.altercode.classlock.entity.Result;
import com.altercode.classlock.entity.User;
import com.altercode.classlock.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	Result result;
	@Autowired
	QuestionService service;
	
	@GetMapping("/questions")
	public ResponseEntity<Page<QuestionDTO>> findAll(Pageable pageable) {
		Page<QuestionDTO> list = service.findAll(pageable);
		return ResponseEntity.ok(list);
	}
	
	Boolean submitted = false;
	
	@ModelAttribute("result")
	public Result getResult() {
		return result;
	}
	
	@GetMapping("/")
	public String home() {
		return "index.html";
	}
	
	@PostMapping("/quiz")
	public String quiz(@RequestParam User username, Model m, RedirectAttributes attributes) {
		if(username.equals("")) {
			attributes.addFlashAttribute("warning", "You must enter your name");
			return "redirect:/";
		}
		
		submitted = false;
		result.setUserName(username);
		
		QuestionForm qForm = service.getQuestions();
		m.addAttribute("qForm", qForm);
		
		return "quiz.html";
	}
	
	@PostMapping("/submit")
	public String submit(@ModelAttribute QuestionForm qForm, Model m) {
		if(!submitted) {
			result.setTotalCorrect(service.getResult(qForm));
			service.saveScore(result);
			submitted = true;
		}
		
		return "result.html";
	}
	
	@GetMapping("/score")
	public String score(Model m) {
		List<Result> sList = service.getTopScore();
		m.addAttribute("sList", sList);
		
		return "scoreboard.html";
	}

}
