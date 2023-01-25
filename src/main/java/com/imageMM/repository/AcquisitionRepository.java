package com.imageMM.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.imageMM.Models.Acquisition;

public interface AcquisitionRepository extends MongoRepository<String, Acquisition>{

}
