package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Restauration;

public interface RestaurationRepository extends MongoRepository<Restauration,String>{
	public Restauration getById(String id);
	public List<Restauration> findByIdOeuvre(String idOeuvre);

}
