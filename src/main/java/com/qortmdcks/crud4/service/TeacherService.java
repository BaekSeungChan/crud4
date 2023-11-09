package com.qortmdcks.crud4.service;

import com.qortmdcks.crud4.payload.StudentDto;
import com.qortmdcks.crud4.payload.TeacherDto;

import java.util.List;

public interface TeacherService {

    TeacherDto createTeacher(TeacherDto teacherDto);

    List<TeacherDto> getALTeacher();

    TeacherDto getTeacherById(long id);

    void deleteTeacherById(long id);

    TeacherDto updateParent(TeacherDto teacherDto, long id);
}
