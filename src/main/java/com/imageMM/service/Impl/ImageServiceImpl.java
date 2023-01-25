package com.imageMM.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import java.util.Map;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.imageMM.Enums.EnumMessage;
import com.imageMM.Models.Image;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.repository.ImageRepository;
import com.imageMM.repository.OeuvreRepository;
import com.imageMM.service.CloudinaryService;
import com.imageMM.service.ImageService;



@Service
public class ImageServiceImpl implements ImageService{

	
	@Autowired
	private ImageRepository repo;
	
    @Autowired
    CloudinaryService cloudinaryService;

	@Override
	public ResponseObject createImage(Image b,MultipartFile file) {
		Map uploadResult=cloudinaryService.upload(file);
		String secure_url = uploadResult.get("secure_url").toString();
		List<String> tags=(List<String>) uploadResult.get("tags");
		System.out.println(tags.get(0));
	    b.setUrl(secure_url);
	    b.setTags(tags);
		//set Tags
		// TODO Auto-generated method stub
		try {
			Image ov=repo.save(b);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}	}



@Override
	public ResponseObject deleteImage(String idImage) {
		// TODO Auto-generated method stub
		try {
			repo.deleteById(idImage);
			return new ResponseObject(EnumMessage.SUCCESS_DELETE.code,
					EnumMessage.SUCCESS_DELETE.label, null); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	
	public ResponseObject updateImage(Image o) {
		// TODO Auto-generated method stub
		try {
			Image ov=repo.save(o);
			return new ResponseObject(EnumMessage.SUCCESS_CREATION.code,
					EnumMessage.SUCCESS_CREATION.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
    public ResponseObject getImageById(String idImage) {
		try {
			Image ov=repo.getById(idImage);
			if(ov==null)
			{
				return new ResponseObject(EnumMessage.OBJECT_NOT_EXISTS.code,
						EnumMessage.OBJECT_NOT_EXISTS.label, null); 
			}
			return new ResponseObject(EnumMessage.OBJECT_EXISTS.code,
					EnumMessage.OBJECT_EXISTS.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}
	}

	
	@Override
	public ResponseObject getAllImage() {
		try {
			List<Image> ov=repo.findAll();
			if(ov==null||ov.isEmpty())
			{
				return new ResponseObject(EnumMessage.LIST_EMPTY.code,
						EnumMessage.LIST_EMPTY.label, null); 
			}
			return new ResponseObject(EnumMessage.LIST_NOT_EMPTY.code,
					EnumMessage.LIST_NOT_EMPTY.label, ov); 

		}catch (Exception e) {
			return new ResponseObject(EnumMessage.ERREUR_QUERY.code, e.getMessage(), null); 
		}

	}


}