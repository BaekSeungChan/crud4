package com.qortmdcks.crud4.service.Impl;

import com.qortmdcks.crud4.entity.Teacher;
import com.qortmdcks.crud4.payload.TeacherDto;
import com.qortmdcks.crud4.repository.TeacherRepository;
import com.qortmdcks.crud4.service.TeacherService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

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

    @Override
    public List<TeacherDto> getALTeacher(){
        List<Teacher> teachers = teacherRepository.findAll();
        return teachers.stream().map((teacher) -> modelMapper.map(teacher, TeacherDto.class)).collect(Collectors.toList());
    }

    @Override
    public TeacherDto getTeacherById(long id) {
        Teacher teacher = teacherRepository.findById(id).orElseThrow(() -> new RuntimeException("No id"));
        return modelMapper.map(teacher, TeacherDto.class);
    }

    @Override
    public void deleteTeacherById(long id){
        Teacher teacher = teacherRepository.findById(id).orElseThrow(()-> new RuntimeException("No id"));
        teacherRepository.delete(teacher);
    }
}
