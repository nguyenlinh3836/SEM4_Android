package com.example.ss7.controller;

import com.example.ss7.dto.MapperDto;
import com.example.ss7.dto.StudentDto;
import com.example.ss7.entity.StudentEntity;
import com.example.ss7.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@Controller
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    MapperDto mapperDto;
    @GetMapping("/index")
    public String Index(Model model){
        List<StudentEntity> students = studentService.getAllStudent();
        model.addAttribute("students", students);
        return"index";
    }

    @GetMapping("/add")
    public String add(Model model) {
        StudentEntity studentEntity = new StudentEntity();
        model.addAttribute("student", studentEntity);
        return "add";
    }

    @PostMapping("/add")
    public String add(@Valid @ModelAttribute StudentDto studentDto, Model model) {
        StudentEntity studentEntity = mapperDto.convertToEntity(studentDto);
        studentService.create(studentEntity);
        return "redirect:/index";
    }

    @PostMapping("/edit")
    public String update( @ModelAttribute StudentEntity studentEntity, Model model){
        studentService.update(studentEntity);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") int id, Model model){
        studentService.delete(id);
        return "redirect:/index";
    }

}
