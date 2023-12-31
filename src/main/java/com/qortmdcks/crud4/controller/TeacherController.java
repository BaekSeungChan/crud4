package com.qortmdcks.crud4.controller;

import com.qortmdcks.crud4.payload.TeacherDto;
import com.qortmdcks.crud4.service.TeacherService;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @GetMapping("/all")
    public ResponseEntity<List<TeacherDto>> getALTeacher(){
        return ResponseEntity.ok(teacherService.getALTeacher());
    }

    @GetMapping("/{id}")
    public  ResponseEntity<TeacherDto> getTeacherById(@PathVariable(name = "id") long id){
        return ResponseEntity.ok(teacherService.getTeacherById(id));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteTeacherById(@PathVariable(name = "id") long id){
        teacherService.deleteTeacherById(id);
        return new ResponseEntity<>("deleted post", HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<TeacherDto> updateParent(@PathVariable(name = "id") long id, @Valid @RequestBody TeacherDto teacherDto){
        TeacherDto parentResponse = teacherService.updateParent(teacherDto, id);
        return new ResponseEntity<>(parentResponse, HttpStatus.OK);
    }

}
