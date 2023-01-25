package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Oeuvre;

public interface OeuvreRepository extends MongoRepository<Oeuvre, String> {
	
	public Oeuvre getById(String idOeuvre);

}
