package com.imageMM.Dto;

import java.io.Serializable;

import org.springframework.web.multipart.MultipartFile;

import com.imageMM.Models.Image;

public class ImageDto implements Serializable{


private  Image image;

private  MultipartFile file;
public ImageDto() {
	super();
	// TODO Auto-generated constructor stub
}
public ImageDto(Image image, MultipartFile file) {
	super();
	this.image = image;
	this.file = file;
}
public Image getImage() {
	return image;
}
public void setImage(Image image) {
	this.image = image;
}
public MultipartFile getFile() {
	return file;
}
public void setFile(MultipartFile file) {
	this.file = file;
}





}
