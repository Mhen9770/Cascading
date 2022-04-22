package com.POC.Hibernate.controller;

import com.POC.Hibernate.Service.StudentServiceImpl;
import com.POC.Hibernate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController {
    @Autowired
    private StudentServiceImpl studentService;

    @PostMapping("/addStudent")
    public Student saveStudent(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @GetMapping("/getAllStudent")
    public List<Student> getAllStudent()
    {
        return studentService.getall();
    }


}
