package com.devathon.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devathon.demo.entity.Users;
import com.devathon.demo.repository.UserRepository;

@RestController
public class UsersTemplate {

  @Autowired
  private UserRepository repository;
  
  @GetMapping("/user")
  public Users getUsersByEmail (String email) {
	  return repository.findByEmail(email);
  }
  
  @PostMapping("/insertOneUser")
  public void insertUser (@RequestBody Users user) {
	  repository.insert(user);
  }
}