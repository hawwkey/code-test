package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.StudentTakesSubject;
import com.brightflag.repository.StudentTakesSubjectRepository;

@Service
public class StudentTakesSubjectService {

    @Autowired
    StudentTakesSubjectRepository studentTakesSubjectRepository;

    public List<StudentTakesSubject> getStudentsAndSubjects() {
        return studentTakesSubjectRepository.getStudentsandSubjects();
    }

}
