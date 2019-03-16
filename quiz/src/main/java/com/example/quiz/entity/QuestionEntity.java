package com.example.quiz.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "question")
public class QuestionEntity {
	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "genre_id")
	private int genreId;

	@Column(name = "question_text")
	private String questionText;
}
