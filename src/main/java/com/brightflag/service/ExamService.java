package com.brightflag.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.brightflag.domain.Exam;
import com.brightflag.repository.ExamRepository;

@Service
public class ExamService {

    @Autowired
    ExamRepository examRepository;

    public List<Exam> getExams() {
        return examRepository.getExams();
    }
}
