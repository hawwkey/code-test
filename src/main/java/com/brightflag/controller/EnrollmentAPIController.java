package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.domain.Enrollment;
import com.brightflag.service.EnrollmentService;

@RestController
public class EnrollmentAPIController {
    @Autowired
    EnrollmentService enrollmentService;

    @RequestMapping("api/getEnrollments")
    public List<Enrollment> getEnrollments() {
        return enrollmentService.getEnrollments();
    }
}
