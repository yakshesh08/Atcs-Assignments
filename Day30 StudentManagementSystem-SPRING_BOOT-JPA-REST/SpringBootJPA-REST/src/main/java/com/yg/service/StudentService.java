package com.yg.service;

import java.util.List;

import com.yg.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	String deleteStudent(int stuId);
	
	Student getStudent(int stuId);
	
	List<Student> getAllStudents();
}
