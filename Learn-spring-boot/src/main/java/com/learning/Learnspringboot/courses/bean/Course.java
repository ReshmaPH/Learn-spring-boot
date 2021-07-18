package com.learning.Learnspringboot.courses.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
//@Entity(name="Course1")
@Entity
public class Course {
	@Id
	@GeneratedValue
	private long id;
	//@Column (name="course_name")
	private String name;
	private String author;
	
	public Course() {
		
	}
	public Course(long id, String name, String author) {
		super();
		this.id = id;
		this.name = name;
		this.author = author;
	}

	@Override
	public String toString() {
		return "Courses [id=" + id + ", name=" + name + ", author=" + author + "]";
	}

	public long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}
	
	
	
	
	
}
