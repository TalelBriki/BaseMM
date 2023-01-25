package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Pret;

public interface PretRepository extends MongoRepository<Pret,String>{

	public Pret getById(String idPret);
}
