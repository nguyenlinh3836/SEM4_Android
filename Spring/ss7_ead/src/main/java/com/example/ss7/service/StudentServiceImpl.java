package com.example.ss7.service;

import com.example.ss7.entity.StudentEntity;
import com.example.ss7.repository.StudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    StudentRepo studentRepo;
    @Override
    public List<StudentEntity> getAllStudent() {
        return studentRepo.findAll();
    }

    @Override
    public StudentEntity create(StudentEntity p) {
        return studentRepo.save(p);
    }

    @Override
    public StudentEntity update(StudentEntity p) {
        return studentRepo.save(p);
    }

    @Override
    public void delete(int id) {
        studentRepo.deleteById(id);
    }
}
