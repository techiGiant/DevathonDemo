package com.devathon.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devathon.demo.entity.Services;
import com.devathon.demo.repository.ServiceRepository;

@RestController
public class ServicesTemplate {

  @Autowired
  private ServiceRepository repository;
  
  @GetMapping("/service")
  public Services getServiceByTitle (String title) {
	  return repository.findByTitle(title);
  }

}