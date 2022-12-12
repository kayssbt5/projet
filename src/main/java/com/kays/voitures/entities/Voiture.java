package com.kays.voitures.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Voiture {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idVoiture;
	private String nomVoiture;
	private Double prixVoiture;
	private Date dateCreation;
	
	@ManyToOne
	private Marque marque;
	
	public Voiture() {
		super();
		}
	
	public Voiture(String nomVoiture, Double prixVoiture, Date dateCreation) {
		super();
		this.nomVoiture = nomVoiture;
		this.prixVoiture = prixVoiture;
		this.dateCreation = dateCreation;
		}
	
	public Long getIdVoiture() {
		return idVoiture;
	}
	public void setIdVoiture(Long idVoiture) {
		this.idVoiture = idVoiture;
	}
	public String getNomVoiture() {
		return nomVoiture;
	}
	public void setNomVoiture(String nomVoiture) {
		this.nomVoiture = nomVoiture;
	}
	public Double getPrixVoiture() {
		return prixVoiture;
	}
	public void setPrixVoiture(Double prixVoiture) {
		this.prixVoiture = prixVoiture;
	}
	public Date getDateCreation() {
		return dateCreation;
	}
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	@Override
	public String toString() {
		return "Voiture [idVoiture=" + idVoiture + ", nomVoiture=" + nomVoiture + ", prixVoiture=" + prixVoiture
				+ ", dateCreation=" + dateCreation + "]";
	}
	public Marque getMarque( ) {
		return marque;
	}
	public void setMarque(Marque marque) {
		this.marque = marque;
	}
	
	
	

}
