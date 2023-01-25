package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Oeuvre;

public interface OeuvreRepository extends MongoRepository<Oeuvre, String> {
	
	public Oeuvre getById(String idOeuvre);
	
	
	public List<Oeuvre> getByIdArtiste(String idArtiste);
	
	
	public List<Oeuvre> getByCategorie(String Categorie);


}
