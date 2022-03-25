package com.yg.service;


import java.util.Optional;

import com.yg.entity.Student;

public interface StudentService {
	
	Student addStudent(Student student);
	
	Student updateStudent(Student student);
	
	void deleteStudent(int stuId);
	
	Optional<Student> getStudent(int stuId);
	
	Iterable<Student> getAllStudents();
}
