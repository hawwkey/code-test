package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Grade;
import com.brightflag.service.GradeService;

@RestController
public class GradeAPIController {
    @Autowired
    GradeService gradeService;

    @RequestMapping("api/getGrades")
    public List<Grade> getGrades() {
        return gradeService.getGrades();
    }
}
