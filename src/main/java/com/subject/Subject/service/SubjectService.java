package com.subject.Subject.service;

import com.subject.Subject.entity.Subject;
import com.subject.Subject.repository.SubjectRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Service
public class SubjectService {

    @Autowired
    private SubjectRepo subjectRepo;

    public Subject getSubjectDetails(int id){
         return subjectRepo.findById(id).orElseThrow(null);
    }
}
