package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.HelloModel;

@Service
public class HelloService {
	public HelloModel getModel() {
		HelloModel model = new HelloModel();
		model.setName("なまえ");
		model.setMessage("テストメッセージ");
		return model;
	}
}
