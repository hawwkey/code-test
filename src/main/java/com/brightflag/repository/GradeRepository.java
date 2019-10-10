package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Grade;

@Repository
public class GradeRepository {

    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Grade> getGrades() {
        return jdbcTemplate.query("SELECT gradeID, result FROM grade;",
                new BeanPropertyRowMapper<Grade>(Grade.class));
    }
}
