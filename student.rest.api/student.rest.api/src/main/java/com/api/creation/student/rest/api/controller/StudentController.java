package com.api.creation.student.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.api.creation.student.rest.api.model.Student;
import com.api.creation.student.rest.api.service.StudentService;

@RestController
public class StudentController {
	@Autowired
	private StudentService studentService;
	
	@GetMapping(value="/Students",produces="application/json")
	public List<Student> getStudents() {
		return studentService.getDetails();
	}
	
	@GetMapping("/Students/{id}")
	public List<Student> getStudentByRollNo(@PathVariable int id) {
		return studentService.getStudentDetailsByRollNo(id);
	}
	
	@PostMapping("/Students")
	public void addStudent(@RequestBody Student student){
		studentService.addNewStudent(student);
	}
	@PutMapping("/Students/{id}")
	public void updateStudent(@PathVariable int id,@RequestBody Student student) {
		 studentService.updateStudent(id,student);
	}
	@DeleteMapping("/Students/{id}")
	public void removeStudent(@PathVariable int id) {
		studentService.removeStudent(id);
	}
}
