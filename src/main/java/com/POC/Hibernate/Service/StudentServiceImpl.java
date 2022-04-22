package com.POC.Hibernate.Service;

import com.POC.Hibernate.Repository.StudentRepository;
import com.POC.Hibernate.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl {
    @Autowired
    private StudentRepository studentRepository;

    public Student saveStudent(Student person) {
    return studentRepository.save(person);
    }

    public List<Student> getall() {
    return studentRepository.findAll();
    }
}
