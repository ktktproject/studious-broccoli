package com.example.form.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.form.vo.FormParameter;

@Controller
public class FormController {
	@RequestMapping(value = "request", method = RequestMethod.POST)
	public String request(FormParameter param, Model model) {
		model.addAttribute("result", param);
		return "request";
	}
}
