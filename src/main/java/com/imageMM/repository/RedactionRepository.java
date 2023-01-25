package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Redaction_notice_inventaire;

public interface RedactionRepository extends MongoRepository<String, Redaction_notice_inventaire>{

}
