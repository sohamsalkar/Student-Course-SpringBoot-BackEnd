package com.example.StudentReg.service;

import java.util.List;
import com.example.StudentReg.model.Student;

public interface IStudentInterface {
	Integer saveStudent(Student s);
	void updateStudent(Student s);
	void deleteStudent(Integer id);
	Student getOneStudent(Integer id);
	List<Student> getAllStudents();
}
