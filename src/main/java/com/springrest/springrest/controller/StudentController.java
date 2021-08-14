package com.springrest.springrest.controller;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;
import com.springrest.springrest.entities.Result;
import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.QuizService;

@RestController
public class StudentController {
	
	Quiz quiz;
	int totalMarks;
	int currQuesId;
	ArrayList<Result> results = new ArrayList<Result>();
	User user = LoginController.user;
	
	@GetMapping("/startQuiz/{id}")
	public void startQuiz(@PathVariable int quizID) {
		quiz = QuizService.quizes.get(quizID);
		totalMarks = 0;
		currQuesId = 0;
	}
	
	@PostMapping("/questions/{id}")
	public void submitAnswer(@PathVariable int id, @RequestBody String Answer) {
		Question ques = quiz.getQuestions().get(id);
		if(ques.getAnswer()== Answer) {
			totalMarks+=ques.getMarks();
		}
	}
	
	@PostMapping("/submit")
	public void submitQuiz() {
		Result rs = new Result(quiz.getId(), user.getId(), totalMarks);
		results.add(rs);
	}
	@GetMapping("/Results")
	public ArrayList<Result> Results() {
		return results;
	}
}
