package com.example.nguyenhoanglinh.repository;

import com.example.nguyenhoanglinh.entity.EmployeeEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepo extends JpaRepository<EmployeeEntity,Integer> {
}
