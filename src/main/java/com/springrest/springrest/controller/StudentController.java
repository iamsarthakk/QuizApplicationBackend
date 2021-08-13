package com.springrest.springrest.controller;

import org.springframework.web.bind.annotation.GetMapping;

import com.springrest.springrest.entities.Quiz;

public class StudentController {
	
	Quiz quiz;
	int totalMarks;
	@GetMapping("/startQuiz/{id}")
	public void startQuiz() {
		totalMarks = 0;
	}
	
	@GetMapping("/questions/{id}")
	public void nextQuestion(int id) {
		totalMarks += quiz.getQuestions().get(id).getMarks();
	}
	
	@GetMapping("/Results")
	public int Results() {
		return totalMarks;
	}
}
