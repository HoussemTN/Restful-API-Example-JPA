package com.Brains404.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produit {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long reference ; 
	private String designation ; 
	private double prix ;
	
	public Produit(Long reference, String designation, double prix) {
		super();
		this.reference = reference;
		this.designation = designation;
		this.prix = prix;
	} 
	
	public Produit() {
		super();
	}

	public Long getReference() {
		return reference;
	}
	public void setReference(Long reference) {
		this.reference = reference;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public double getPrix() {
		return prix;
	}
	public void setPrix(double prix) {
		this.prix = prix;
	}
	@Override
	public String toString() {
		return "Produit [reference=" + reference + ", designation=" + designation + ", prix=" + prix + "]";
	}
	

}
