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
import com.imageMM.service.OeuvreService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
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
    OeuvreService oeuvreService;
	
	
	
	 @ApiOperation(value = "create new oeuvre", notes = "return  the new oeuvre created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createOeuvre", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createOeuvre(
			@ApiParam
			@RequestBody
			Oeuvre oeuvre)
	{
	return oeuvreService.createOeuvreObject(oeuvre);
	}
	

	
	
	 @ApiOperation(value = "delete given oeuvre", notes = "delete  a given oeuvre.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteOeuvre/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteOeuvre(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return oeuvreService.deleteOeuvreObject(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  oeuvre by id", notes = "get oeuvre by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getOeuvreById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getOeuvreById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return oeuvreService.getOeuvreObjectById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  oeuvre list", notes = "get oeuvre by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllOeuvre", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllOeuvre() {
		return oeuvreService.getAllOeuvreObject();
		 
	 }
	 
	 
	 @ApiOperation(value = "update oeuvre ", notes = "update oeuvre\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>oeuvre does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateOeuvre", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateOeuvre(
			 @ApiParam
			 @RequestBody
			 Oeuvre o
			 ) {
		return oeuvreService.updateOeuvreObject(o);
		 
	 }
	 
	 
	 @ApiOperation(value = "get Oeuvre list By Criteres  ", notes = "filter oeuvres\n"
	            + "\n<b>result = 1 :</b>list not empty \n" 
	            + "\n<b>result = -2 :</b>list  empty\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            + "\n<b>critere = ARTISTE  value = idARTISTE\n" 
	            + "\n<b>critere = CATEGORIE  value = categroie\n" 

	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllOeuvreByCritere/{critere}/{value}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllOeuvreByCritere(
			 @ApiParam(value = "critere")
			 @PathVariable(name = "critere")
			 String critere,
			 
			 @ApiParam(value = "value")
			 @PathVariable(name = "value")
			 String value
			 
			 ) {
		return oeuvreService.findOeuvreByCritere(critere,value);
		 
	 }

}
