package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Redaction_notice_inventaire;
import com.imageMM.Models.Restauration;

public interface RestaurationRepository extends MongoRepository<Restauration,String>{
	public Restauration getById(String id);

}
