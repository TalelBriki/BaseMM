package com.imageMM.Models;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

enum Moyen_acc{achat , don , legs}

@Document(collection = "Acquisition")
public class Acquisition {

	@Id
	@GeneratedValue(generator = "String2")
	private String id;
	
	private String current_owner;
	private Date date_acc;
	private String lieu_acc;

    private double prix;
    private Moyen_acc moyenne_acc;
    
    private String preuve_achat;
    private String certif_auth;
    private String idOeuvre;
    
    
    
	
	public Acquisition() {
		super();
		// TODO Auto-generated constructor stub
	}




	public Acquisition(String id, String current_owner, Date date_acc, String lieu_acc, double prix,
			Moyen_acc moyenne_acc, String preuve_achat, String certif_auth
			,String idOeuvre
			) {
		super();
		this.id = id;
		this.current_owner = current_owner;
		this.date_acc = date_acc;
		this.lieu_acc = lieu_acc;
		this.prix = prix;
		this.moyenne_acc = moyenne_acc;
		this.preuve_achat = preuve_achat;
		this.certif_auth = certif_auth;
		this.idOeuvre=idOeuvre;
	}




	public String getId() {
		return id;
	}




	public void setId(String id) {
		this.id = id;
	}




	public String getCurrent_owner() {
		return current_owner;
	}




	public void setCurrent_owner(String current_owner) {
		this.current_owner = current_owner;
	}




	public Date getDate_acc() {
		return date_acc;
	}




	public void setDate_acc(Date date_acc) {
		this.date_acc = date_acc;
	}




	public String getLieu_acc() {
		return lieu_acc;
	}




	public void setLieu_acc(String lieu_acc) {
		this.lieu_acc = lieu_acc;
	}




	public double getPrix() {
		return prix;
	}




	public void setPrix(double prix) {
		this.prix = prix;
	}




	public Moyen_acc getMoyenne_acc() {
		return moyenne_acc;
	}




	public void setMoyenne_acc(Moyen_acc moyenne_acc) {
		this.moyenne_acc = moyenne_acc;
	}




	public String getPreuve_achat() {
		return preuve_achat;
	}




	public void setPreuve_achat(String preuve_achat) {
		this.preuve_achat = preuve_achat;
	}




	public String getCertif_auth() {
		return certif_auth;
	}




	public void setCertif_auth(String certif_auth) {
		this.certif_auth = certif_auth;
	}




	public String getIdOeuvre() {
		return idOeuvre;
	}




	public void setIdOeuvre(String idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	
	
	
	
    
}
