package com.random.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.random.dao.Crud;
import com.random.entity.UserLoginCredential;

@RestController
@RequestMapping("/user")
public class UserController {
	
	@Autowired
	private Crud crud;
	
	@GetMapping("/single/{email}")
	public UserLoginCredential getUser(@PathVariable String email) {
		return crud.findByEmail(email);
}

}