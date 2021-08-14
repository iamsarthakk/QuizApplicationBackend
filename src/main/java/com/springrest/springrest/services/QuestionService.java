package com.springrest.springrest.services;

import java.util.ArrayList;
import java.util.List;

import com.springrest.springrest.entities.Question;
import com.springrest.springrest.entities.Quiz;

public class QuestionService implements IQuestionService {

	QuizService quizS = new QuizService();
	@Override
	public List<Question> getQuestions(int id) {
		
		return null;
	}

	@Override
	public void addQuestion(String question, String answer, int marks, Quiz quiz, String optA, String optB, String optC,
			String optD) {
		// TODO Auto-generated method stub

	}

	@Override
	public void saveQuestions() {
		// TODO Auto-generated method stub

	}

}
