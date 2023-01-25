package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Exposition;

public interface ExpositionRepository extends MongoRepository<Exposition,String>{
	public Exposition getById(String id);

}
