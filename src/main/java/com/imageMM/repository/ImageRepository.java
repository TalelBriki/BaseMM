package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Image;
import com.imageMM.Models.Signature;

public interface ImageRepository extends MongoRepository<Image,String>{
	public Image getById(String id);

}
