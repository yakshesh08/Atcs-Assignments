package com.pack1.dao;

import java.util.List;

import com.pack1.entity.Student;

public interface Studentdao {

	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	String deleteStudent(int stuId);
	
	Student getStudent(int stuId);
	
	List<Student> getAllStudents();
	
	
}
