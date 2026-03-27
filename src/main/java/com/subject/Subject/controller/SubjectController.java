package com.subject.Subject.controller;

import com.subject.Subject.entity.Subject;
import com.subject.Subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/{id}")
    public Subject getSubject(@PathVariable  int id){
         return subjectService.getSubjectDetails(id);
    }


}
