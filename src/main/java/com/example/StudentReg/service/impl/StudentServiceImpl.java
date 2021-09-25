package com.example.StudentReg.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.StudentReg.model.Student;
import com.example.StudentReg.repo.StudentRepository;
import com.example.StudentReg.service.IStudentInterface;
import com.example.StudentReg.util.StudentUtil;


@Service
public class StudentServiceImpl implements IStudentInterface {

	@Autowired
	private StudentRepository repo;
	@Autowired
	private StudentUtil util;
	
	public Integer saveStudent(Student s) {
		
		util.calulateDetails(s);
		s=repo.save(s);
		return s.getStdId();
	}

	public void updateStudent(Student s) {
		
		util.calulateDetails(s);
		repo.save(s);
	}

	public void deleteStudent(Integer id) {
		
		repo.deleteById(id);
	}

	public Student getOneStudent(Integer id) {
		Optional<Student> opt = repo.findById(id);
		if(opt.isPresent()) {
			return opt.get();
		}
		return null;
	}

	public List<Student> getAllStudents() {
		return repo.findAll();
	}

}
