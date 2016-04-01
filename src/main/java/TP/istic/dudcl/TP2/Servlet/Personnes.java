package TP.istic.dudcl.TP2.Servlet;

import java.util.Date;

public class Personnes {
	
	String nom;
	String prenom;
	Date dateDeNaissance;
	int age;
	String adresse;
	
	public Personnes(String nom, String prenom, Date dateDeNaissance, int age, String adresse) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateDeNaissance = dateDeNaissance;
		this.age = age;
		this.adresse = adresse;
	}
	
}
