package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Conditional;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@Controller
public class UserController {
	@Autowired private UserService service;
	
	@GetMapping("/user/join")
	public String joinForm() {
		return "user/join";
	}
	
	@PostMapping("/user/join")
	public String join(User user) {
		service.save(user);
		return "user/joinOk";
	}
}
