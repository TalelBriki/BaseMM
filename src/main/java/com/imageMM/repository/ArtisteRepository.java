package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Artiste;

public interface ArtisteRepository extends MongoRepository<String, Artiste>{

}
