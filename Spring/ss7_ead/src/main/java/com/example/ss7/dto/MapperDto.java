package com.example.ss7.dto;

import com.example.ss7.entity.StudentEntity;
import org.mapstruct.Mapper;
import org.mapstruct.NullValueCheckStrategy;

@Mapper(componentModel = "spring",nullValueCheckStrategy = NullValueCheckStrategy.ALWAYS)
public interface MapperDto {
    StudentEntity convertToEntity(StudentDto studentDto);
    StudentDto convertToDto(StudentEntity studentEntity);
}
