package com.devathon.demo.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.devathon.demo.entity.Pages;
import com.devathon.demo.repository.PageRepository;

@RestController
public class PagesTemplate {

  @Autowired
  private PageRepository repository;
  
  @GetMapping("/page")
  public Pages getUsersByEmail (String pageTitle) {
	  return repository.findByPageTitle(pageTitle);
  }
  
  @PostMapping("/insertOnePage")
  public void insertUser (@RequestBody Pages page) {
	  repository.insert(page);
  }
}