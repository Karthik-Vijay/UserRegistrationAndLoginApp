package com.karthik.UserRegandLoginApp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.karthik.UserRegandLoginApp.entity.Login;
import com.karthik.UserRegandLoginApp.entity.User;
import com.karthik.UserRegandLoginApp.service.UserService;


@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class UserController {
	@Autowired
	private UserService userService;

	// Constructor DI for service class
	public UserController(UserService userService) {
		this.userService = userService;
	}


	@PostMapping("/register")
	public void saveUsers(@RequestBody User user) {
		System.out.println("Data saved successfully");
		userService.register(user);
	}

	
	@RequestMapping("/login")
	public Boolean loginUser(@RequestBody Login user) {
		System.out.println(this.getClass());
		return userService.login(user);

	}

	@RequestMapping("/update-user")
	public User UpdateUser(@RequestBody User user) {
		return userService.update(user);
	}

}