package com.learning.Learnspringboot.courses.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.learning.Learnspringboot.courses.bean.Course;
import com.learning.Learnspringboot.courses.repository.CourseRepository;

@RestController
public class CourseController {

	@Autowired
	private CourseRepository repository;

	@GetMapping("/courses")

	public List<Course> getCourses() {
	/*	List<Course> list = new ArrayList<>();
		list.add(new Course(1, "Learn Microservices", "Udemy"));
		list.add(new Course(2, "Learn Spring", "Ranga"));
		return list;
	*/
		return repository.findAll();
	}

	@GetMapping("/courses/{id}")

	public Course getCourseDetails(@PathVariable long id) {

		Optional<Course> course= repository.findById(id);
		if(course.isEmpty()){
			throw new RuntimeException("Course not found with id"+id);
		}
		return course.get();
	}
	
	@PostMapping("/courses")
	public void createCourse(@RequestBody Course course) {
		repository.save(course);
	}
	
	@PutMapping("/courses/{id}")
	public void updateCourse(@PathVariable long id,@RequestBody Course course) {
		repository.save(course);
	}
	
	@DeleteMapping("/courses/{id}")
	public void deleteCourse(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
