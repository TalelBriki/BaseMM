package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.Models.Pret;

public interface LocalisationRepository  extends MongoRepository<Localisation_de_conservation,String>{
	public Localisation_de_conservation getById(String id);

}
