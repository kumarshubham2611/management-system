package com.student.system.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.system.entity.Student;

public interface StudentRepository extends JpaRepository<Student,Long>{

}
