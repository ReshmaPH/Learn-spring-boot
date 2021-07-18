package com.learning.Learnspringboot.courses.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.learning.Learnspringboot.courses.bean.Course;

public interface CourseRepository extends JpaRepository<Course,Long>{

}
