package com.example.ss7.repository;

import com.example.ss7.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<StudentEntity,Integer> {

}
