package com.yg.dao;

import java.util.List;

import com.yg.entity.Student;

public interface Studentdao {

	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	String deleteStudent(int stuId);
	
	Student getStudent(int stuId);
	
	List<Student> getAllStudents();
	
	
}
