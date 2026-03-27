package com.subject.Subject.entity;

import jakarta.persistence.*;
import org.springframework.stereotype.Component;

@Entity
@Table(name="Subject")
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "subject_name")
    private String subjectName;

    public Subject() {

    }

    public int getId() {
        return id;
    }

    public Subject(int id) {
        this.id = id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Subject(int id, String subjectName) {
        this.id = id;
        this.subjectName = subjectName;
    }

    public String getSubjectName(){
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", subjectName='" + subjectName + '\'' +
                '}';
    }
}


