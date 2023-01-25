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

import com.imageMM.Models.Redaction_notice_inventaire;
import com.imageMM.service.RedactionService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;


@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class RedactionEndPoint {
     @Autowired
     RedactionService RedactionService;
	
	
	
	 @ApiOperation(value = "create new Redaction", notes = "return  the new Redaction created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/createRedaction", 
			  produces = "application/json", 
			  method = RequestMethod.POST)
	public Object createRedaction(
			@ApiParam
			@RequestBody
			Redaction_notice_inventaire redaction)
	{
	return RedactionService.createRedaction(redaction);
	}
	

	
	
	 @ApiOperation(value = "delete given Redaction", notes = "delete  a given Redaction.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteRedaction/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteRedaction(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return RedactionService.deleteRedaction(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Redaction by id", notes = "get Redaction by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getRedactionById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getRedactionById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return RedactionService.getRedactionById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Redaction list", notes = "get Redaction by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllRedaction", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllRedaction() {
		return RedactionService.getAllRedaction();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Redaction ", notes = "update Redaction\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Redaction does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateRedaction", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateRedaction(
			 @ApiParam
			 @RequestBody
			 Redaction_notice_inventaire o
			 ) {
		return RedactionService.updateRedaction(o);
		 
	 }


}
