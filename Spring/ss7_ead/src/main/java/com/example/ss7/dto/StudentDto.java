package com.example.ss7.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
    private int id;
    @NotBlank(message = "please fill fullname")
    private String name;
    private String Gender;
    private String Email;
    private String phone;
    private String birthday;
    private String country;
}
