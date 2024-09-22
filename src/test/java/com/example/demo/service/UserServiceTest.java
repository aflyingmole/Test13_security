package com.example.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import com.example.demo.entity.User;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
@Commit
public class UserServiceTest {
	@Autowired private UserService userService;
	
	@Test
	void save() {
		userService.save(new User(0L,"hello","1234","MEMBER"));
	}
	
	@Test
	void ismember() {
		boolean result= userService.isMember("hello", "1234231");
		System.out.println("result:"+ result);
	}
}













