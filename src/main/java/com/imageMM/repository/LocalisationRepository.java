package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Localisation_de_conservation;

public interface LocalisationRepository  extends MongoRepository<String, Localisation_de_conservation>{

}
