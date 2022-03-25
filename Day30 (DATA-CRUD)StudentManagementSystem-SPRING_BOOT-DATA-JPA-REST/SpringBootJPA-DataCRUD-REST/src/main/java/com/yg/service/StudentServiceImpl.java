package com.yg.service;


import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.yg.dao.Studentdao;
import com.yg.entity.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService{
	
	@Autowired
	Studentdao dao;
	
	@Override
	public Student addStudent(Student student) {
		
		return dao.save(student);
	}

	@Override
	public Student updateStudent(Student student) {
		
		return dao.save(student);
	}

	@Override
	public void deleteStudent(int stuId) {
		
		 dao.deleteById(stuId);
	}

	@Override
	public Optional<Student> getStudent(int stuId) {
		
		return dao.findById(stuId);
		
	}

	@Override
	public Iterable<Student> getAllStudents() {
		
		return dao.findAll();
	}

}
