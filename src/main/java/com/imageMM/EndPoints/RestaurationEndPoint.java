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

import com.imageMM.Models.Restauration;
import com.imageMM.service.RestaurationService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class RestaurationEndPoint {
     @Autowired
     RestaurationService RestaurationService;
	
	
	
	 @ApiOperation(value = "create new Restauration", notes = "return  the new Restauration created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createRestauration", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createRestauration(
			@ApiParam
			@RequestBody
			Restauration restauration)
	{
	return RestaurationService.createRestauration(restauration);
	}
	

	
	
	 @ApiOperation(value = "delete given Restauration", notes = "delete  a given Restauration.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteRestauration/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteRestauration(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return RestaurationService.deleteRestauration(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Restauration by id", notes = "get Restauration by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getRestaurationById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getRestaurationById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return RestaurationService.getRestaurationById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Restauration list", notes = "get Restauration by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllRestauration", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllRestauration() {
		return RestaurationService.getAllRestauration();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Restauration ", notes = "update Restauration\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Restauration does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateRestauration", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateRestauration(
			 @ApiParam
			 @RequestBody
			 Restauration o
			 ) {
		return RestaurationService.updateRestauration(o);
		 
	 }


}
