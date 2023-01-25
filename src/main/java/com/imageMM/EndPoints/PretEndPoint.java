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

import com.imageMM.Models.Pret;
import com.imageMM.service.PretService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;



@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class PretEndPoint {
     @Autowired
     PretService PretService;
	
	
	
	 @ApiOperation(value = "create new Pret", notes = "return  the new Pret created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createPret", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createPret(
			@ApiParam
			@RequestBody
			Pret Pret)
	{
	return PretService.createPret(Pret);
	}
	

	
	
	 @ApiOperation(value = "delete given Pret", notes = "delete  a given Pret.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deletePret/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deletePret(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return PretService.deletePret(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Pret by id", notes = "get Pret by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getPretById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getPretById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return PretService.getPretById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Pret list", notes = "get Pret by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllPret", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllPret() {
		return PretService.getAllPret();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Pret ", notes = "update Pret\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Pret does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updatePret", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updatePret(
			 @ApiParam
			 @RequestBody
			 Pret o
			 ) {
		return PretService.updatePret(o);
		 
	 }


}
