package com.test.UserApi.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryImplementation;
import org.springframework.stereotype.Repository;

import com.test.UserApi.model.User;
@Repository
public interface UserRepository extends JpaRepositoryImplementation<User, Integer> {

	 public User findById(int id); 
}
