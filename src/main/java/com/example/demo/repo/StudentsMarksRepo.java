package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.StudentsMarks;

public interface StudentsMarksRepo extends JpaRepository<StudentsMarks, Integer>{

}