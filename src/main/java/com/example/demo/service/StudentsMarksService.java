
package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.StudentsMarks;
import com.example.demo.repo.StudentsMarksRepo;

@Service
public class StudentsMarksService {
	
	@Autowired
	StudentsMarksRepo stuMarksRepo;

	public String addAllNewStudentMarks(List<StudentsMarks> allStuMarksList) {
		String res = "";
		
		try {
			stuMarksRepo.saveAll(allStuMarksList);
			res = "successfully added all students marks";
		}catch(Exception e) {
			res = "not able to save into DB";
		}
		return res;
	}

	public List<StudentsMarks> fetchAllStudentsAbove60Marks() {
		
		
		List<StudentsMarks> allStudents = stuMarksRepo.findAll();
		
		StudentsMarks eachStu = null;
		
		List<StudentsMarks> all60MarksStusList = new ArrayList<StudentsMarks>();
		
		for(int i=0;i<allStudents.size();i++) {
			
			eachStu = allStudents.get(i);
			
			if( (eachStu.getMaths() >= 60) 
					&& (eachStu.getSci() >= 60)
					&&(eachStu.getEng() >= 60)
				) {
				
				all60MarksStusList.add(eachStu);
			}
			
		}
		
		
		return all60MarksStusList;
	}

}
