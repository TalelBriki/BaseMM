package com.imageMM.EndPoints;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.imageMM.Dto.ImageDto;
import com.imageMM.Models.Image;
import com.imageMM.service.CloudinaryService;
import com.imageMM.service.ImageService;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import springfox.documentation.spring.web.json.Json;





@RestController
@CrossOrigin("*")
@RequestMapping("/v1")
public class ImageEndPoint {
     @Autowired
     ImageService imageService;
     @Autowired
     CloudinaryService cloudinaryService;
	
     
     
 	@ApiOperation(value = "upload file")
	 @PostMapping("/uploadFile")
	    public @ResponseBody
	    Map uploadFile(
	    		@ApiParam
	    		@RequestParam("file") MultipartFile file) {
	        return cloudinaryService.upload( file);
	    }
	
	
	 @ApiOperation(value = "create new Image", notes = "return  the new Image created.\n"
	            + "\n<b>result = 1 :</b>object created successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class,consumes = "multipart/form-data")
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	
	 @PostMapping("/createImage/{idOeuvre}/{nb_inventaire}/{copyright_notice}/{droits_photographiques}")
	    public @ResponseBody
	 Object createImage(
		  @ApiParam
		  @PathVariable
		  String idOeuvre,
		  @ApiParam
		  @PathVariable
		  int nb_inventaire,
		  @ApiParam
		  @PathVariable
		  String copyright_notice,
		  @ApiParam
		  @PathVariable
		  String droits_photographiques,
		  @ApiParam
		  @PathVariable MultipartFile file
		 )
	{
		 Image i=new Image();
		 i.setCopyright_notice(copyright_notice);
		 i.setDroits_photographiques(droits_photographiques);
		 i.setIdOeuvre(idOeuvre);
		 i.setNb_inventaire(nb_inventaire);
		 
	return imageService.createImage(i,file);
	}
	

	
	
	 @ApiOperation(value = "delete given Image", notes = "delete  a given Image.\n"
	            + "\n<b>result = 1 :</b>object deleted successfully\n" 
	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/deleteImage/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.DELETE)
	 public Object deleteImage(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return imageService.deleteImage(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Image by id", notes = "get Image by given id.\n"
	            + "\n<b>result = 1 :</b>object exists\n" 
	            + "\n<b>result = -2 :</b>object not exists \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getImageById/{id}", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getImageById(
			 @ApiParam
			 @PathVariable
			 String id
			 ) {
		return imageService.getImageById(id);
		 
	 }
	 
	 
	 @ApiOperation(value = "get  Image list", notes = "get Image by given id.\n"
	            + "\n<b>result = 1 :</b>list not empty\n" 
	            + "\n<b>result = -2 :</b>list empty \n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/getAllImage", 
			  produces = "application/json", 
			  method = RequestMethod.GET)
	 public Object getAllImage() {
		return imageService.getAllImage();
		 
	 }
	 
	 
	 @ApiOperation(value = "update Image ", notes = "update Image\n"
	            + "\n<b>result = 1 :</b>updated successfully\n" 
	            + "\n<b>result = -2 :</b>Image does not exist\n" 

	            + "\n<b>result = -3 :</b> Query failed\n" 
	            , response = Object.class)
	    @ApiResponses(value = { @ApiResponse(code = 200, message = "OK", response = Object.class),
	            @ApiResponse(code = 401, message = "Unauthorized"), @ApiResponse(code = 403, message = "Forbidden"),
	            @ApiResponse(code = 404, message = "not found") })
	 @RequestMapping(
			  value = "/updateImage", 
			  produces = "application/json", 
			  method = RequestMethod.PUT)
	 public Object updateImage(
			 @ApiParam
			 @RequestBody
			 Image o
			 ) {
		return imageService.updateImage(o);
		 
	 }


}



