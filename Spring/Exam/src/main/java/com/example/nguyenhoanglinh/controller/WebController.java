package com.example.nguyenhoanglinh.controller;

import com.example.nguyenhoanglinh.entity.EmployeeEntity;
import com.example.nguyenhoanglinh.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class WebController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping({"/list"})
    public String index(Model model) {
        List<EmployeeEntity> employees = employeeService.findAllEmployee() ;
        model.addAttribute("employees", employees);
        return "list";
    }
    @GetMapping({"/", "/index"})
    public String add(Model model){
        model.addAttribute("employee", new EmployeeEntity());
        return "index";
    }

    @PostMapping( value = "/add")
    public  String addEmployee(@ModelAttribute EmployeeEntity employee, Model model){
        employeeService.createEmployee(employee);
        model.addAttribute("employees",employeeService.findAllEmployee());
        return "redirect:list";
    }
}
