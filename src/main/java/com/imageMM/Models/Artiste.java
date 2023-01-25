package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Artiste")
public class Artiste {
	@Id
	@GeneratedValue(generator = "String2")
	private String id;
	private String nom;
	private String prenom;
	private Date date_nais;
	private Date date_dec;
	private String lieu_nais;
	private String lieu_dec;
	private String nationalite;
	private String biografie;
	
	
	
	
	public Artiste() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Artiste(String id, String nom, String prenom, Date date_nais, Date date_dec, String lieu_nais,
			String lieu_dec, String nationalite, String biografie) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.date_nais = date_nais;
		this.date_dec = date_dec;
		this.lieu_nais = lieu_nais;
		this.lieu_dec = lieu_dec;
		this.nationalite = nationalite;
		this.biografie = biografie;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getNom() {
		return nom;
	}




	public void setNom(String nom) {
		this.nom = nom;
	}




	public String getPrenom() {
		return prenom;
	}




	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}




	public Date getDate_nais() {
		return date_nais;
	}




	public void setDate_nais(Date date_nais) {
		this.date_nais = date_nais;
	}




	public Date getDate_dec() {
		return date_dec;
	}




	public void setDate_dec(Date date_dec) {
		this.date_dec = date_dec;
	}




	public String getLieu_nais() {
		return lieu_nais;
	}




	public void setLieu_nais(String lieu_nais) {
		this.lieu_nais = lieu_nais;
	}




	public String getLieu_dec() {
		return lieu_dec;
	}




	public void setLieu_dec(String lieu_dec) {
		this.lieu_dec = lieu_dec;
	}




	public String getNationalite() {
		return nationalite;
	}




	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}




	public String getBiografie() {
		return biografie;
	}




	public void setBiografie(String biografie) {
		this.biografie = biografie;
	}




	@Override
	public String toString() {
		return "Artiste [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", date_nais=" + date_nais
				+ ", date_dec=" + date_dec + ", lieu_nais=" + lieu_nais + ", lieu_dec=" + lieu_dec + ", nationalite="
				+ nationalite + ", biografie=" + biografie + "]";
	}
	
	
	
	
}
