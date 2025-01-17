package com.example.demo.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin 
public class MyUserController {
	
	
	@GetMapping("four-wheeler/user/isValidUser")
	public Boolean checkUser(@RequestParam String uName, String password) {
		
		System.out.println("from React Data----------->");
		System.out.println("UserName---->"+uName);
		System.out.println("Password---->"+password);
		return false;
	}

	
}
