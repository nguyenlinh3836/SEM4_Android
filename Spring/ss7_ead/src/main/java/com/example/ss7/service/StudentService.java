package com.example.ss7.service;

import com.example.ss7.entity.StudentEntity;

import java.util.List;

public interface StudentService {
    List<StudentEntity> getAllStudent();
    StudentEntity create(StudentEntity p);
    StudentEntity update(StudentEntity p);
    void 

}
