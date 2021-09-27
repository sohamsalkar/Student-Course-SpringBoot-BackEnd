package com.example.StudentReg.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.StudentReg.model.Student;
import com.example.StudentReg.service.IStudentInterface;

@RestController
@RequestMapping("/")
@CrossOrigin("https://student-register-angular.herokuapp.com/")
public class StudentRestController {
	

	@Autowired
	private IStudentInterface service;
	
	//1.save
	@PostMapping("/create")
	public ResponseEntity<String> saveStudent(@RequestBody Student student){
		Integer id = service.saveStudent(student);
		String body = "Student save with ID  " + id;
		return ResponseEntity.ok(body);
	}
	
	//2.fetch all
	@GetMapping("/all")
	public ResponseEntity<List<Student>> getAllStudents(){
		List<Student> list = service.getAllStudents();
		return ResponseEntity.ok(list);
	}
	
	//3.fetch one
	@GetMapping("/one/{id}")
	public ResponseEntity<Student> getOneStudent(@PathVariable Integer id){
		Student student = service.getOneStudent(id);
		return ResponseEntity.ok(student);
	}
	//4.update
	@PutMapping("/update")
	public ResponseEntity<String> updateStudent(@RequestBody Student student){
		service.updateStudent(student);
		String body = "Student updated !";
		return ResponseEntity.ok(body);
	}
	
	//5.delete
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delStudent(@PathVariable Integer id){
		service.deleteStudent(id);
		String body = "Student deleted with ID "+id;
		
		return ResponseEntity.ok(body);
	}
}
