package com.example.demo.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.demo.model.HelloModel;

@Component
public class HelloDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void find() {
		jdbcTemplate.query(this.getSQL(), this.getMapper());
	}

	private String getSQL() {
		return "";
	}

	private RowMapper<HelloModel> getMapper() {
		RowMapper<HelloModel> mapper = new RowMapper<HelloModel>() {
			public HelloModel mapRow(ResultSet rs, int rowNum) throws SQLException {
				HelloModel model = new HelloModel();
				return model;
			}
		};
		return mapper;
	}
}
