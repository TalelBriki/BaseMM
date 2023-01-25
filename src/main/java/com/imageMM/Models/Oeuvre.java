package com.imageMM.Models;

import java.util.Date;

import javax.persistence.GeneratedValue;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
enum Type_tirage {
	gravure,
	photo
}

enum Categorie{
	Peinture,
	Sculpture,
	Arts_graphiques,
	Photographie,
	Vidéo,
	Textile,
	Installation,
	Autres
}

@Document(collection = "Oeuvre")
public class Oeuvre {
	
	@Id
	@GeneratedValue(generator = "String2")
	private String id;
	private String titre;
	private String idArtiste;
	private Date dareCreation;
	private double Height;
	private double Width;
	private double profondeur;
	private double poids;
	private int nb_elements;
	private int nb_tirage;
	private Type_tirage type_tirage;
	private String description;
	private Categorie categorie;
	
	public Oeuvre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Oeuvre(String titre, String idArtiste, Date dareCreation, double height, double width, double profondeur,
			double poids, int nb_elements, int nb_tirage, Type_tirage type_tirage, String description,Categorie categorie,
			String id
			) {
		super();
		this.titre = titre;
		this.idArtiste = idArtiste;
		this.dareCreation = dareCreation;
		Height = height;
		Width = width;
		this.profondeur = profondeur;
		this.poids = poids;
		this.nb_elements = nb_elements;
		this.nb_tirage = nb_tirage;
		this.type_tirage = type_tirage;
		this.description = description;
        this.categorie=categorie;
        this.id=id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getIdArtiste() {
		return idArtiste;
	}

	public void setIdArtiste(String idArtiste) {
		this.idArtiste = idArtiste;
	}

	public Date getDareCreation() {
		return dareCreation;
	}

	public void setDareCreation(Date dareCreation) {
		this.dareCreation = dareCreation;
	}

	public double getHeight() {
		return Height;
	}

	public void setHeight(double height) {
		Height = height;
	}

	public double getWidth() {
		return Width;
	}

	public void setWidth(double width) {
		Width = width;
	}

	public double getProfondeur() {
		return profondeur;
	}

	public void setProfondeur(double profondeur) {
		this.profondeur = profondeur;
	}

	public double getPoids() {
		return poids;
	}

	public void setPoids(double poids) {
		this.poids = poids;
	}

	public int getNb_elements() {
		return nb_elements;
	}

	public void setNb_elements(int nb_elements) {
		this.nb_elements = nb_elements;
	}

	public int getNb_tirage() {
		return nb_tirage;
	}

	public void setNb_tirage(int nb_tirage) {
		this.nb_tirage = nb_tirage;
	}

	public Type_tirage getType_tirage() {
		return type_tirage;
	}

	public void setType_tirage(Type_tirage type_tirage) {
		this.type_tirage = type_tirage;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Œuvre [titre=" + titre + ", idArtiste=" + idArtiste + ", dareCreation=" + dareCreation + ", Height="
				+ Height + ", Width=" + Width + ", profondeur=" + profondeur + ", poids=" + poids + ", nb_elements="
				+ nb_elements + ", nb_tirage=" + nb_tirage + ", type_tirage=" + type_tirage + ", description="
				+ description + "]";
	}
	
	
	
	

}
