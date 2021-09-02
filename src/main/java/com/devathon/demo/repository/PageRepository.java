package com.devathon.demo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.devathon.demo.entity.Pages;

public interface PageRepository extends MongoRepository<Pages, String> {
	  public Pages findByPageTitle(String pageTitle);
}