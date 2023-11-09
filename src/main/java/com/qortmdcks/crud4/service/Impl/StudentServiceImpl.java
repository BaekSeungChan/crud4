package com.qortmdcks.crud4.service.Impl;

import com.qortmdcks.crud4.entity.Student;
import com.qortmdcks.crud4.payload.StudentDto;
import com.qortmdcks.crud4.payload.TeacherDto;
import com.qortmdcks.crud4.repository.StudentRepository;
import com.qortmdcks.crud4.service.StudentService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {
    private StudentRepository studentRepository;

    private ModelMapper modelMapper;

    public StudentServiceImpl(StudentRepository studentRepository, ModelMapper modelMapper){
        this.studentRepository = studentRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public StudentDto createStudent(StudentDto studentDto){
        Student student = modelMapper.map(studentDto, Student.class);
        Student savedStudent = studentRepository.save(student);

        return modelMapper.map(savedStudent, StudentDto.class);
    }
}
