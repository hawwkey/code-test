package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Enrollment;
import com.brightflag.repository.EnrollmentRepository;

@Service
public class EnrollmentService {

    @Autowired
    EnrollmentRepository enrollmentRepository;

    public List<Enrollment> getEnrollments() {
        return enrollmentRepository.getEnrollments();
    }

}
