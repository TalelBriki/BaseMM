package com.imageMM.EndPoints;

import java.io.IOException;
import java.net.URI;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;

import com.google.gson.reflect.TypeToken;
import com.imageMM.Models.Oeuvre;
import com.imageMM.Response.ResponseObject;
import com.imageMM.service.CloudinaryService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import springfox.documentation.spring.web.json.Json;

import java.lang.reflect.Type;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.gson.Gson;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class OeuvreEndpoint {
	
    @Autowired
    CloudinaryService cloudinaryService;
	
	
	@RequestMapping(
			  value = "/createOeuvre", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	@ApiOperation(value = "create new oeuvre")
	public ResponseObject createOeuvre(
			@ApiParam
			@RequestBody
			Oeuvre oeuvre)
	{
	return null;
	}
	
	@ApiOperation(value = "upload file")
	 @PostMapping("/uploadFile")
	    public @ResponseBody
	    String uploadAvatar(
	    		@ApiParam
	    		@RequestParam("file") MultipartFile file) {
	        return cloudinaryService.upload( file);
	    }

}
