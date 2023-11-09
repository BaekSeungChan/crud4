package com.qortmdcks.crud4.service.Impl;

import com.qortmdcks.crud4.entity.Teacher;
import com.qortmdcks.crud4.payload.TeacherDto;
import com.qortmdcks.crud4.repository.TeacherRepository;
import com.qortmdcks.crud4.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class TeacherServiceImpl implements TeacherService {

    private TeacherRepository teacherRepository;
    private ModelMapper modelMapper;

    public TeacherServiceImpl(TeacherRepository teacherRepository, ModelMapper modelMapper){
        this.teacherRepository = teacherRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public TeacherDto createTeacher(TeacherDto teacherDto){
        Teacher teacher = modelMapper.map(teacherDto, Teacher.class);
        Teacher saveTeacher = teacherRepository.save(teacher);

        return modelMapper.map(saveTeacher, TeacherDto.class);
    }


}
