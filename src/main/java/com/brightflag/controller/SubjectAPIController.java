package com.brightflag.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.brightflag.service.SubjectService;
import com.brightflag.domain.Subject;

@RestController
public class SubjectAPIController {

	@Autowired
	SubjectService subjectService;

	@RequestMapping("api/getSubjects")
	public List<Subject> getSubjects() {
		return subjectService.getSubjects();
	}


}
