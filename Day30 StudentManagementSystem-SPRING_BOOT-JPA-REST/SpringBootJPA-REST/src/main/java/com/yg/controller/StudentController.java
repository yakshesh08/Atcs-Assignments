package com.yg.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yg.entity.Student;
import com.yg.service.StudentService;

@RestController
@RequestMapping("/student") //http://localhost:6543/student
public class StudentController {
	
	@Autowired
	StudentService service;
	
	
	//post=>insert,get=>get,put=>save,delete=>remove
	
	
	@PostMapping("/addStudent")    //http://localhost:6543/student/addStudent
	public Student addStudent(@RequestBody Student stu) {
				
		return service.addStudent(stu);
	}
	
	@PutMapping("/updateStudent")    //http://localhost:6543/student/updateStudent
	public Student updateStudent(@RequestBody Student stu) {
				
		return service.updateStudent(stu);
	}
	
	@GetMapping("/getStudent/(sid)")    //http://localhost:6543/student/getStudent/sid
	public Student getStudent(@PathVariable("sid") int stuId) {
				
		return service.getStudent(stuId);
	}
	
	@GetMapping("/getAllStudents")    //http://localhost:6543/student/getAllStudents
	public List<Student> getAllStudents() {
				
		return service.getAllStudents();
	}
	

	@DeleteMapping("/deleteStudent/(sid)")    //http://localhost:6543/student/deleteStudent/sid
	public String deleteStudent(@PathVariable("sid") int stuId) {
				
		return service.deleteStudent(stuId);
	}

}
