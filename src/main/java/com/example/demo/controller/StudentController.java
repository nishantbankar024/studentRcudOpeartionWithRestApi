package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;

@RequestMapping("/student")
@Controller
public class StudentController {
	
	@Autowired
	StudentService stdSer;
	
	@PostMapping("/")
	public Student add(@RequestBody Student std) {
		return this.stdSer.addStudent(std);
		
	}

}
