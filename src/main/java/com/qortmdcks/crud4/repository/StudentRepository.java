package com.qortmdcks.crud4.repository;

import com.qortmdcks.crud4.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
