package com.qortmdcks.crud4.service;

import com.qortmdcks.crud4.payload.StudentDto;

import java.util.List;

public interface StudentService {
    StudentDto createStudent(StudentDto studentDto);

    List<StudentDto> getAllStudent();

    StudentDto getStudentById(long id);
}
