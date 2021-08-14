package com.springrest.springrest.services;

import java.util.List;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;

public interface IQuizServices {
	public List<Quiz> getQuizes();
	public Quiz addQuiz(String title, String description);
	public void deleteQuiz(int id);
	public void updateQuiz(Quiz quiz);
	
	public List<Question> getQuestions(int id);
	public void addQuestion(Question ques);
	public void deleteQues(int id, int quizID);
	public void updateQues(Question ques);
	 
}
