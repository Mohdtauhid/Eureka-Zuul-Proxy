package com.test.UserApi.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.UserApi.model.User;
import com.test.UserApi.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository repository;

	public UserService() {
		// TODO Auto-generated constructor stub
	}

	public User getUserById(int userId) {
		return repository.findById(userId);
	}

	public List<User> getUser() {
		List<User> list = (List<User>) this.repository.findAll();
		return list;
	}

	public User add(User user) {

		return repository.save(user);
	}

	public void deleteById(int userId) {
		repository.deleteById(userId);
	}

	public void update(int id, User user) {
		user.setId(id);
		repository.save(user);
	}

	public void partialUpdate(int id, User user) {
		user.setId(id);
		repository.save(user);

	}

}
