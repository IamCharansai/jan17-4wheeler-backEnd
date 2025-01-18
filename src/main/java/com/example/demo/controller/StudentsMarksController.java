
package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.StudentsMarks;
import com.example.demo.service.StudentsMarksService;

@RestController
@CrossOrigin("*")
public class StudentsMarksController {
	
	@Autowired
	StudentsMarksService stuMarksService;
	
	@PostMapping("/exam/marks/add/all")
	public String addAllNewStudentMarks(@RequestBody List<StudentsMarks> allStuMarksList){
		
		
		String res = stuMarksService.addAllNewStudentMarks(allStuMarksList);
		
		return res;
	}
	
	@GetMapping("/exam/marks/60")
	public List<StudentsMarks>  getAll60AboveMarks(){
		
		return stuMarksService.fetchAllStudentsAbove60Marks();
		
		
	}
	

}
