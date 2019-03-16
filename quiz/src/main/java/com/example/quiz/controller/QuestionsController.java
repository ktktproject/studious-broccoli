package com.example.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.quiz.entity.QuestionEntity;
import com.example.quiz.service.QuestionService;

@Controller
public class QuestionsController {
	@Autowired
	private QuestionService questionService;

	@RequestMapping("/questions")
	public String questions(Model model) {
		QuestionEntity questionEntity = questionService.getQuestion();
		model.addAttribute("question", questionEntity);
		return "questions";
	}
}
