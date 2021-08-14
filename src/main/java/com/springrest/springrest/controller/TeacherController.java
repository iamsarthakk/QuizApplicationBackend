package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;
import com.springrest.springrest.services.IQuizServices;

@RestController
public class TeacherController {
	@Autowired
	private IQuizServices quizS;
	
	
	@PostMapping("/addQuiz")
	public void addQuiz(@RequestBody Quiz quiz) {
		this.quizS.addQuiz(quiz.getTitle(), quiz.getDescription());
	}
	
	@PostMapping("/editQuiz")
	public void editQuiz(@RequestBody Quiz quiz) {
		this.quizS.updateQuiz(quiz);
	}
	
	@PostMapping("/addQuestion")
	public void addQuestion(@RequestBody Question ques) {
		this.quizS.addQuestion(ques);
		
	}
	
	@PostMapping("/editQuestion")
	public void editQuestion(@RequestBody Question ques) {
		this.quizS.updateQues(ques);
	}
	
	@PostMapping("/deleteQuestion/{quizID}/{id}")
	public void deleteQuestion(@PathVariable int quizID, @PathVariable int id) {
		this.quizS.deleteQues(id, quizID);
	}
	
	@GetMapping("/deleteQuiz/{id}")
	public void deleteQuiz(@PathVariable int id) {
		this.quizS.deleteQuiz(id);
	}
	
}
