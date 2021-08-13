package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;

public interface IQuestionService {
	 public List<Question> getQuestions(int id);
	 public void addQuestion(String question, String answer, int marks, Quiz quiz, String optA, String optB, String optC, String optD);
	 public void saveQuestions();
}
