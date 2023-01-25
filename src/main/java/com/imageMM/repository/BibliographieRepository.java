package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Bibliographie;

public interface BibliographieRepository extends MongoRepository<Bibliographie,String>{
	public Bibliographie getById(String id);
	public List<Bibliographie> findByIdOeuvre(String idOeuvre);

	

}
