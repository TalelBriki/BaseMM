package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Redaction_notice_inventaire;

public interface RedactionRepository extends MongoRepository<Redaction_notice_inventaire,String>{
	public Redaction_notice_inventaire getById(String id);

}
