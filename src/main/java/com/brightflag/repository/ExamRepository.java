package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Exam;

@Repository
public class ExamRepository {

	@Autowired
	JdbcTemplate jdbcTemplate;

	public List<Exam> getExams() {
		return jdbcTemplate.query("SELECT examID, examName FROM exam;",
				new BeanPropertyRowMapper<Exam>(Exam.class));
	}

}
