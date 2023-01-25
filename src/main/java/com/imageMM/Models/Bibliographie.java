package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;

public class Bibliographie {
	
	@Id
	@GeneratedValue(generator = "String2")

	private String id;
	private String idOeuvre;
	private String idAuteur;
	private Date date_pub;
	private int page;
	private String idEditeur;
	public Bibliographie() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Bibliographie(String id, String idOeuvre, String idAuteur, Date date_pub, int page,
			String idEditeur) {
		super();
		this.id = id;
		this.idOeuvre = idOeuvre;
		this.idAuteur = idAuteur;
		this.date_pub = date_pub;
		this.page = page;
		this.idEditeur = idEditeur;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getIdOeuvre() {
		return idOeuvre;
	}
	public void setIdOeuvre(String idOeuvre) {
		this.idOeuvre = idOeuvre;
	}
	public String getIdAuteur() {
		return idAuteur;
	}
	public void setIdAuteur(String idAuteur) {
		this.idAuteur = idAuteur;
	}
	public Date getDate_pub() {
		return date_pub;
	}
	public void setDate_pub(Date date_pub) {
		this.date_pub = date_pub;
	}
	public int getPage() {
		return page;
	}
	public void setPage(int page) {
		this.page = page;
	}
	public String getIdEditeur() {
		return idEditeur;
	}
	public void setIdEditeur(String idEditeur) {
		this.idEditeur = idEditeur;
	}
	@Override
	public String toString() {
		return "Bibliographie [id=" + id + ", idOeuvre=" + idOeuvre + ", idAuteur=" + idAuteur
				+ ", date_pub=" + date_pub + ", page=" + page + ", idEditeur=" + idEditeur + "]";
	}
	
	
	
	
	
	

}
