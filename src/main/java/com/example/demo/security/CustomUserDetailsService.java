package com.example.demo.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import com.example.demo.entity.User;
import com.example.demo.respository.UserRepository;

@Component
public class CustomUserDetailsService implements UserDetailsService {
	@Autowired private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user=userRepository.findByUsername(username);
		if(user==null) {
			 throw new UsernameNotFoundException("User not found");
		}
		UserDetails userDetails=new CustomUserDetails(user);
		return userDetails;
	}
}










