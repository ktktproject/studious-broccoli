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

	/**
	 * 全てからランダム抽出
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public QuestionEntity find() {
		List<QuestionEntity> result = manager
				.createNativeQuery("select id,genre_id,question_text from question order by rand() limit 1",
						QuestionEntity.class)
				.getResultList();
		return result.get(0);
	}

	/**
	 * ジャンル指定でランダム抽出
	 *
	 * @param genreId
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public QuestionEntity find(String genreId) {
		List<QuestionEntity> result = manager
				.createNativeQuery(
						"select id,genre_id,question_text from question where genre_id = :genreId order by rand() limit 1",
						QuestionEntity.class)
				.setParameter("genreId", genreId).getResultList();
		return result.get(0);
	}
}
