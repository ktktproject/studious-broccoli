package com.example.quiz.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.quiz.dao.QuestionDAO;
import com.example.quiz.entity.QuestionEntity;

@Service
public class QuestionService {
	@Autowired
	private QuestionDAO questionDAO;

	public QuestionEntity getQuestion() {
		return questionDAO.find();
	}

	public QuestionEntity getQuestion(String genreId) {
		return questionDAO.find(genreId);
	}
}
