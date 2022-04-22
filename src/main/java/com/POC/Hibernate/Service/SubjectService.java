package com.POC.Hibernate.Service;

import com.POC.Hibernate.Repository.SubjectRepository;
import com.POC.Hibernate.entity.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SubjectService {

@Autowired
    private SubjectRepository addressRepo;

    public Subject saveSubject(Subject subject) {
    return addressRepo.save(subject);
    }
}
