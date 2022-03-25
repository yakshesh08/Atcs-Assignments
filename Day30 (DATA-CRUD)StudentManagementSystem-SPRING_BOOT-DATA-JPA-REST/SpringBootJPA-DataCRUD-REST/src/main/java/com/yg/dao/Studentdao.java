package com.yg.dao;

import org.springframework.data.repository.CrudRepository;

import com.yg.entity.Student;

public interface Studentdao extends CrudRepository<Student, Integer> {

	
}
