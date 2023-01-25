package com.imageMM.service;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class CloudinaryService {
    private final org.slf4j.Logger logger = org.slf4j.LoggerFactory.getLogger(this.getClass());



    public Map upload( MultipartFile file) {
       
    	
    	Cloudinary cloudinary = new Cloudinary(ObjectUtils.asMap(
    			"cloud_name", "dtct6e2ku",
    			"api_key", "197267898245687",
    			"api_secret", "sK5kz8msXbaUkS0KRSNFKpxqCpw",
    			"secure", true));
    	
            try {
                Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.asMap(
                	    "categorization", "imagga_tagging", 
                	    "auto_tagging", "0.4"));
                System.out.println("\n --------------\n"+uploadResult.toString());
                //String secure_url = uploadResult.get("secure_url").toString();
                return uploadResult;
            } catch (Exception ex) {
            	
                logger.error(ex.getMessage());
                return null;
            }
       
    }


}
