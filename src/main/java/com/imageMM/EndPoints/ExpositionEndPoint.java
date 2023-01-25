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

import com.imageMM.Models.Exposition;
import com.imageMM.service.ExpositionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class ExpositionEndPoint {
     @Autowired
     ExpositionService ExpositionService;
	
	
	
	 @ApiOperation(value = "create new Exposition", notes = "return  the new Exposition created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createExposition", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createExposition(
			@ApiParam
			@RequestBody
			Exposition Exposition)
	{
	return ExpositionService.createExposition(Exposition);
	}
	

	
	
	 @ApiOperation(value = "delete given Exposition", notes = "delete  a given Exposition.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteExposition/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteExposition(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return ExpositionService.deleteExposition(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Exposition by id", notes = "get Exposition by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getExpositionById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getExpositionById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return ExpositionService.getExpositionById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Exposition list", notes = "get Exposition by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllExposition", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllExposition() {
		return ExpositionService.getAllExposition();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Exposition ", notes = "update Exposition\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Exposition does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateExposition", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateExposition(
			 @ApiParam
			 @RequestBody
			 Exposition o
			 ) {
		return ExpositionService.updateExposition(o);
		 
	 }


}
