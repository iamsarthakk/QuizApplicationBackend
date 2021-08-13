package com.springrest.springrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.services.IQuestionService;
import com.springrest.springrest.services.IQuizServices;

@RestController
public class TeacherController {
	@Autowired
	private IQuizServices quizS;
	private IQuestionService quesS;
}
