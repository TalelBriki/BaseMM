package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Image;

public interface ImageRepository extends MongoRepository<String, Image>{

}
