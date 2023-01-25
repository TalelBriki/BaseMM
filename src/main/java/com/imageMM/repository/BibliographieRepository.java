package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Bibliographie;

public interface BibliographieRepository extends MongoRepository<String, Bibliographie>{

}
