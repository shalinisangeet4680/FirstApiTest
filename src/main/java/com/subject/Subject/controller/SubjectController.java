package com.subject.Subject.controller;

import com.subject.Subject.entity.Subject;
import com.subject.Subject.service.SubjectService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/subjects")
public class SubjectController {

    @Autowired
    private SubjectService subjectService;

    @GetMapping("/{id}")
    public Subject getSubject(@PathVariable  int id){
         return subjectService.getSubjectDetails(id);
    }

    @PostMapping
    public Subject addSubject(@RequestBody  Subject subject){
        return subjectService.addSubject(subject);
    }


}
