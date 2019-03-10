package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.demo.service.HelloService;

@Controller
public class HelloController {
	@Autowired
	HelloService helloService;

	@RequestMapping(path = "/hello", method = RequestMethod.GET)
	public String hello(Model model) {
		model.addAttribute("model", helloService.getModel());
		return "hello";
	}
}
