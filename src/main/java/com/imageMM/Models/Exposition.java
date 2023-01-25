package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "Exposition")
public class Exposition {
	
	
	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String titre;
	private String lieu;
	private Date date_debut;
	private Date date_fin;
	
	
	
	public Exposition() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Exposition(String id, String titre, String lieu, Date date_debut, Date date_fin) {
		super();
		this.id = id;
		this.titre = titre;
		this.lieu = lieu;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public String getLieu() {
		return lieu;
	}
	public void setLieu(String lieu) {
		this.lieu = lieu;
	}
	public Date getDate_debut() {
		return date_debut;
	}
	public void setDate_debut(Date date_debut) {
		this.date_debut = date_debut;
	}
	public Date getDate_fin() {
		return date_fin;
	}
	public void setDate_fin(Date date_fin) {
		this.date_fin = date_fin;
	}
	
	
	

}
