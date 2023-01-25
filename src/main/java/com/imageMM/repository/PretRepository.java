package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Image;
import com.imageMM.Models.Pret;

public interface PretRepository extends MongoRepository<Pret,String>{

	public Pret getById(String idPret);
	public List<Pret>  findByIdExposition(String idExposition);

}
