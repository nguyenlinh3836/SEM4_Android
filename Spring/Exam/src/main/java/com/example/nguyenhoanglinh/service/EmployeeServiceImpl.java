package com.example.nguyenhoanglinh.service;

import com.example.nguyenhoanglinh.entity.EmployeeEntity;
import com.example.nguyenhoanglinh.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
    @Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    EmployeeRepo employeeRepo;

        @Override
        public List<EmployeeEntity> findAllEmployee() {
            return employeeRepo.findAll();
        }
        @Override
        public EmployeeEntity createEmployee(EmployeeEntity p) {
            return employeeRepo.save(p);
        }
    }
