package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;
import com.springrest.springrest.services.IQuestionService;
import com.springrest.springrest.services.IQuizServices;

@RestController
public class TeacherController {
	@Autowired
	private IQuizServices quizS;
	private IQuestionService quesS;
	private Quiz quiz;
	
	@PostMapping("/addQuiz")
	public void addQuiz(@RequestBody Quiz quiz) {
		this.quizS.addQuiz(quiz.getTitle(), quiz.getDescription());
	}
	@PostMapping("/addQuestion")
	public void addQuestion(@RequestBody Question ques) {
		quiz.getQuestions().add(ques);
		this.quesS.addQuestion(ques.getQuestion(), ques.getAnswer(), ques.getMarks(), ques.getQuiz(), ques.getOptionA(), ques.getOptionB(), ques.getOptionC(), ques.getOptionD());
	}
	
	@PostMapping("/editQuestion")
	public void editQuestion(@RequestBody Question ques) {
//		quiz.getQuestions().add(ques);
//		this.quesS.addQuestion(ques.getQuestion(), ques.getAnswer(), ques.getMarks(), ques.getQuiz(), ques.getOptionA(), ques.getOptionB(), ques.getOptionC(), ques.getOptionD());
	}
	
	@GetMapping("/deleteQuestion/{id}")
	public void deleteQuestion(@PathVariable int id) {
		
	}
	
}
