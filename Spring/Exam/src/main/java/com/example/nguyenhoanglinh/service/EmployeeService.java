package com.example.nguyenhoanglinh.service;

import com.example.nguyenhoanglinh.entity.EmployeeEntity;

import java.util.List;

public interface EmployeeService {
    List<EmployeeEntity> findAllEmployee();
    EmployeeEntity createEmployee(EmployeeEntity p);
}
