package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.StudentTakesSubject;
import com.brightflag.service.StudentTakesSubjectService;

@RestController
public class StudentTakesSubjectAPIController {
    @Autowired
    StudentTakesSubjectService studentTakesSubjectService;

    @RequestMapping("api/getStudentsAndSubjects")
    public List<StudentTakesSubject> getStudentsAndSubjects() {
        return studentTakesSubjectService.getStudentsAndSubjects();
    }
}
