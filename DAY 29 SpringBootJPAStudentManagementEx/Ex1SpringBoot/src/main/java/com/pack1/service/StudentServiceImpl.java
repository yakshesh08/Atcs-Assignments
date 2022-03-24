package com.pack1.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pack1.dao.Studentdao;
import com.pack1.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	Studentdao dao;
	
	@Override
	public Student addStudent(Student student) {
		
		return dao.addStudent(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return dao.updateStudent(student);
	}

	@Override
	public String deleteStudent(int stuId) {
		
		return dao.deleteStudent(stuId);
	}

	@Override
	public Student getStudent(int stuId) {
		
		return dao.getStudent(stuId);
		
	}

	@Override
	public List<Student> getAllStudents() {
		
		return dao.getAllStudents();
	}

}
