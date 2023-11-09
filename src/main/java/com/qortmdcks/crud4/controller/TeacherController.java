package com.qortmdcks.crud4.controller;

import com.qortmdcks.crud4.payload.TeacherDto;
import com.qortmdcks.crud4.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/teacher")
public class TeacherController {
    private TeacherService teacherService;

    public TeacherController(TeacherService teacherService){
        this.teacherService = teacherService;
    }

    @PostMapping
    public ResponseEntity<TeacherDto> createStudent(@Valid @RequestBody TeacherDto teacherDto){
        return new ResponseEntity<>(teacherService.createTeacher(teacherDto), HttpStatus.OK);
    }
}
