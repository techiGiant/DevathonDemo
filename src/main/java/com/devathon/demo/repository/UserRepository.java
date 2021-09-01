package com.devathon.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.devathon.demo.entity.Users;

public interface UserRepository extends MongoRepository<Users, String> {
	  public Users findByEmail(String email);
}