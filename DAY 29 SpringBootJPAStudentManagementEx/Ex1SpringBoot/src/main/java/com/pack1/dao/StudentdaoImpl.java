package com.pack1.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.pack1.entity.Student;


@Repository
public class StudentdaoImpl implements Studentdao{
	
	@PersistenceContext
	EntityManager entity;

	@Override
	public Student addStudent(Student student) {
		entity.persist(student);
		return entity.find(Student.class, student.getStuId());
	}

	@Override
	public Student updateStudent(Student student) {
		
		return entity.merge(student);
	}

	@Override
	public String deleteStudent(int stuId) {
		
		Student stu=entity.find(Student.class, stuId);
		
		if(stu!=null) {
			entity.remove(stu);
			return "Student deleted";
		}
		else {
			return "Student not found";
		}
	}

	@Override
	public Student getStudent(int stuId) {
		
		return entity.find(Student.class, stuId);
	}

	@Override
	public List<Student> getAllStudents() {
		TypedQuery<Student> result= entity.createQuery("select c from Student s",Student.class);
		return result.getResultList();
	}

}
