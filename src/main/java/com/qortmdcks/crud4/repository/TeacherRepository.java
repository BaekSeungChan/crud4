package com.qortmdcks.crud4.repository;

import com.qortmdcks.crud4.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeacherRepository extends JpaRepository<Teacher, Long> {
}
