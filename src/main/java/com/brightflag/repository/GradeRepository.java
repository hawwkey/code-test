package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Grade;

@Repository
public class GradeRepository {
    //TODO
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Grade> getGrades() {
        //TODO
        return jdbcTemplate.query("SELECT examID, examName FROM exam;",
                new BeanPropertyRowMapper<Grade>(Grade.class));
    }
}
