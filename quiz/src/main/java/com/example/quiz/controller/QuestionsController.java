package com.example.quiz.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.quiz.entity.QuestionEntity;
import com.example.quiz.service.QuestionService;

@Controller
public class QuestionsController {
	@Autowired
	private QuestionService questionService;

	/**
	 * パラメータなしのコントローラ
	 *
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/questions", method = RequestMethod.GET)
	public String questions(Model model) {
		QuestionEntity questionEntity = questionService.getQuestion();
		model.addAttribute("question", questionEntity);
		return "questions";
	}

	/**
	 * パラメータありのコントローラ.<br>
	 * アクセス例:/questions2?genreId=1
	 *
	 * @param genreId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/questions2", method = RequestMethod.GET)
	public String questions2(@RequestParam("genreId") String genreId, Model model) {
		QuestionEntity questionEntity = questionService.getQuestion(genreId);
		model.addAttribute("question", questionEntity);
		return "questions";
	}

	/**
	 * パラメータありのコントローラ.<br>
	 * アクセス例:/questions3/1
	 *
	 * @param genreId
	 * @param model
	 * @return
	 */
	@RequestMapping(value = "/questions3/{genreId}", method = RequestMethod.GET)
	public String questions3(@PathVariable("genreId") String genreId, Model model) {
		QuestionEntity questionEntity = questionService.getQuestion(genreId);
		model.addAttribute("question", questionEntity);
		return "questions";
	}
}
