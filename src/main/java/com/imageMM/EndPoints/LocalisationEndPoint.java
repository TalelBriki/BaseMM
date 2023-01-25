package com.imageMM.EndPoints;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.imageMM.Models.Localisation_de_conservation;
import com.imageMM.service.LocalisationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class LocalisationEndPoint {
     @Autowired
     LocalisationService LocalisationService;
	
	
	
	 @ApiOperation(value = "create new Localisation", notes = "return  the new Localisation created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createLocalisation", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createLocalisation(
			@ApiParam
			@RequestBody
			Localisation_de_conservation localisation)
	{
	return LocalisationService.createLocalisation(localisation);
	}
	

	
	
	 @ApiOperation(value = "delete given Localisation", notes = "delete  a given Localisation.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteLocalisation/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteLocalisation(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return LocalisationService.deleteLocalisation(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Localisation by id", notes = "get Localisation by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getLocalisationById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getLocalisationById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return LocalisationService.getLocalisationById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Localisation list", notes = "get Localisation by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllLocalisation", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllLocalisation() {
		return LocalisationService.getAllLocalisation();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Localisation ", notes = "update Localisation\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Localisation does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateLocalisation", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateLocalisation(
			 @ApiParam
			 @RequestBody
			 Localisation_de_conservation o
			 ) {
		return LocalisationService.updateLocalisation(o);
		 
	 }


}
