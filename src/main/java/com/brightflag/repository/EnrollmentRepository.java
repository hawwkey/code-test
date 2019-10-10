package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.Enrollment;

@Repository
public class EnrollmentRepository {

        @Autowired
        JdbcTemplate jdbcTemplate;

        public List<Enrollment> getEnrollments() {
            return jdbcTemplate.query("SELECT recordID, studentID, subjectID, gradeID FROM enrollment;",
                    new BeanPropertyRowMapper<Enrollment>(Enrollment.class));
        }
}
