package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Quiz;

public interface IQuizServices {
	public List<Quiz> getQuizes();
	public Quiz addQuiz(String title, String description);
}
