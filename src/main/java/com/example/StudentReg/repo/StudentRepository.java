package com.example.StudentReg.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.StudentReg.model.Student;

public interface StudentRepository extends JpaRepository<Student,Integer>
{

}
