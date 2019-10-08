package com.brightflag.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.brightflag.domain.StudentTakesSubject;

@Repository
public class StudentTakesSubjectRepository {

        @Autowired
        JdbcTemplate jdbcTemplate;

        public List<StudentTakesSubject> getStudentsandSubjects() {
            return jdbcTemplate.query("SELECT studentID, subjectID FROM studenttakessubject;",
                    new BeanPropertyRowMapper<StudentTakesSubject>(StudentTakesSubject.class));
        }
}
