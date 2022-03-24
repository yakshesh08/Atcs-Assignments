package com.pack1;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.pack1.entity.Student;
import com.pack1.service.StudentService;

@SpringBootTest
class Ex1SpringBootApplicationTests {
	
	@Autowired
	StudentService service;
	
	@Test
	
	void testAddStudent() {
		Student student = new Student(180,"Yakshesh","Rajesh","JPR");
		
		Student stu=service.addStudent(student);
		
		assertEquals(stu.getStuName(),"Yakshesh");
	}
}
