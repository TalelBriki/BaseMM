package com.imageMM.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Exposition;
import com.imageMM.Models.Image;
import com.imageMM.Models.Signature;

public interface ImageRepository extends MongoRepository<Image,String>{
	public Image getById(String id);
	public List<Image> findByTags(String tag);
	public List<Image> findByIdOeuvre(String idOeuvre);

}
