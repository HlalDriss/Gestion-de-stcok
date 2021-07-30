package application_stock.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Article implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codeArt;
     private String nomArt;
     private String descArt;
     private double prixArt;
     private int qteArt;
	public Article() {
		super();
	}
	public Article(Integer codeArt, String nomArt, String descArt, double prixArt, int qteArt) {
		super();
		this.codeArt = codeArt;
		this.nomArt = nomArt;
		this.descArt = descArt;
		this.prixArt = prixArt;
		this.qteArt = qteArt;
	}
	public Integer getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(Integer codeArt) {
		this.codeArt = codeArt;
	}
	public String getNomArt() {
		return nomArt;
	}
	public void setNomArt(String nomArt) {
		this.nomArt = nomArt;
	}
	public String getDescArt() {
		return descArt;
	}
	public void setDescArt(String descArt) {
		this.descArt = descArt;
	}
	public double getPrixArt() {
		return prixArt;
	}
	public void setPrixArt(double prixArt) {
		this.prixArt = prixArt;
	}
	public int getQteArt() {
		return qteArt;
	}
	public void setQteArt(int qteArt) {
		this.qteArt = qteArt;
	}
     
} 
