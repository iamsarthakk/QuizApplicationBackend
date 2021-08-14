package com.springrest.springrest.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springrest.springrest.entities.User;
import com.springrest.springrest.services.IUserServices;


@RestController
public class LoginController {
	
	@Autowired
	private IUserServices userService;
	
	@PostMapping("/login")
	public User login(@RequestBody User user) {
		return this.userService.getUser(user.getUsername(), user.getPassword());
	}
	
	@PostMapping("/register")
	public User register(@RequestBody User user) {
		return this.userService.addUser(user);
	}
	
	@GetMapping("/users")
	public ArrayList<User> getUsers(){
		return this.userService.getUsers();
	}
}
