package com.gauree.quizapp;

import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("question")
public class QuizController {
	
	@GetMapping("allQuestions")
	public String getAllQuestions() {
		return "Hi, These are your questions!";
	}
}
