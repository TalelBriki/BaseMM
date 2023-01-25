package com.imageMM.service;

import com.imageMM.Models.Image;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;

public interface ImageService {

	public ResponseObject createImage(Image i);

	ResponseObject deleteImage(String idImage);

	ResponseObject updateImage(Image o);

	ResponseObject getImageById(String idImage);

	ResponseObject getAllImage();
}
