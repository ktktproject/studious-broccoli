package com.example.quiz.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.quiz.entity.QuestionEntity;

@Repository
public class QuestionDAO {
	@Autowired
	private EntityManager manager;

	@SuppressWarnings("unchecked")
	public QuestionEntity find() {
		List<QuestionEntity> result = manager
				.createNativeQuery(this.getSQL(), QuestionEntity.class).getResultList();
		return result.get(0);
	}

	private String getSQL() {
		String sql = "SELECT id,genre_id,question_text FROM question ORDER BY RAND() LIMIT 1;";
		return sql;
	}
}
