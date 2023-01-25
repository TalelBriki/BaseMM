package com.imageMM.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;

enum ModeSockage{
	Accrochée,
	Posée_au_sol,
	Roulée,
	rayonnage,
	
	Emballée
	
}
 @Document(collection = "Localisation_de_conservation")
public class Localisation_de_conservation {
	
	 @Id
		@GeneratedValue(generator = "String2")

	 private String id;
	private String lieu;
	private String place_depot;
	private ModeSockage  stockage;
	//Emballée :
	//à préciser (papier bulle, papier kraft…) :
	private String typeEmballe;
	public Localisation_de_conservation() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Localisation_de_conservation(String id, String lieu, String place_depot, ModeSockage stockage,
			String typeEmballe) {
		super();
		this.id = id;
		this.lieu = lieu;
		this.place_depot = place_depot;
		this.stockage = stockage;
		this.typeEmballe = typeEmballe;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public String getPlace_depot() {
		return place_depot;
	}
	public void setPlace_depot(String place_depot) {
		this.place_depot = place_depot;
	}
	public ModeSockage getStockage() {
		return stockage;
	}
	public void setStockage(ModeSockage stockage) {
		this.stockage = stockage;
	}
	public String getTypeEmballe() {
		return typeEmballe;
	}
	public void setTypeEmballe(String typeEmballe) {
		this.typeEmballe = typeEmballe;
	}
	
	
	
	
	
	

}
