package com.devathon.demo.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.devathon.demo.entity.Services;

public interface ServiceRepository extends MongoRepository<Services, String> {
	  public Services findByTitle(String title);
	  public List<Services> findAll();
}