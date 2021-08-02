package com.api.creation.student.rest.api.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Component;

import com.api.creation.student.rest.api.model.Student;
@Component
public class StudentService {

	private List<Student> list=new ArrayList<>(Arrays.asList(new Student(1,"Resh","EEE",1.2)
			,new Student(2,"Sandhu","EEE",1.5)
			,new Student(3,"Risha","ECE",1.7)
			,new Student(4,"Renju","CSE",1.9)));
	
		public List<Student> getDetails() {

			return list;
		}
		
		public List<Student> getStudentDetailsByRollNo(int id) {
			return list.stream().filter(x->x.getRollNo()==id).collect(Collectors.toList());
		}
		public void addNewStudent(Student student){
			list.add(student);
		}

		public void updateStudent(int id, Student student) {
			Student student2 = list.stream().filter(x->x.getRollNo()==id).findFirst().get();
			int index=list.indexOf(student2);
			list.set(index,student);
		}

		public void removeStudent(int id) {
			
			Student student2 = list.stream().filter(x->x.getRollNo()==id).findFirst().get();
			int index=list.indexOf(student2);
			list.remove(index);
			
		}
}
