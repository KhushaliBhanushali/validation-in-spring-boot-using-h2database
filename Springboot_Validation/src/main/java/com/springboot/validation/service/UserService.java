package com.springboot.validation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.validation.model.User;
import com.springboot.validation.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;
	
	public User createUser(User user) {
		return repository.save(user);
	}
}
