package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Acquisition;
import com.imageMM.Models.Localisation_de_conservation;

public interface AcquisitionRepository extends MongoRepository<Acquisition,String>{
	public Acquisition getById(String id);
	public List<Acquisition> findByIdOeuvre(String idOeuvre);

}
