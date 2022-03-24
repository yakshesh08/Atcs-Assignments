package com.pack1.service;

import java.util.List;

import com.pack1.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	String deleteStudent(int stuId);
	
	Student getStudent(int stuId);
	
	List<Student> getAllStudents();
}
