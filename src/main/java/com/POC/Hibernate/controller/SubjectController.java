package com.POC.Hibernate.controller;

import com.POC.Hibernate.Service.SubjectService;
import com.POC.Hibernate.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubjectController {

 @Autowired
    private SubjectService subjectService;

 @PostMapping("/saveSubject")
    public Subject save(@RequestBody Subject subject){
     return subjectService.saveSubject(subject);
 }


}
