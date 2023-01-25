package com.imageMM.service;

import org.springframework.web.multipart.MultipartFile;

import com.imageMM.Models.Image;
import com.imageMM.Response.ResponseObject;

public interface ImageService {

	public ResponseObject createImage(Image i,MultipartFile file);

	ResponseObject deleteImage(String idImage);

	ResponseObject updateImage(Image o);

	ResponseObject getImageById(String idImage);

	ResponseObject getAllImage();
	
	ResponseObject findImageByTag(String tag);
	ResponseObject getByIdOeuvre();

}
