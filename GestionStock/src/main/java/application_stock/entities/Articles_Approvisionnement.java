package application_stock.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Articles_Approvisionnement {
    
	@Id
   private Integer	codeArt ; 
    private int qteCommande ;
    private String datePrevueLivraison;
    
    
    
	public Articles_Approvisionnement() {
		super();
	}
	public Articles_Approvisionnement(Integer codeArt, int qteCommande, String datePrevueLivraison) {
		super();
		this.codeArt = codeArt;
		this.qteCommande = qteCommande;
		this.datePrevueLivraison = datePrevueLivraison;
	}
	public Integer getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(Integer codeArt) {
		this.codeArt = codeArt;
	}
	public int getQteCommande() {
		return qteCommande;
	}
	public void setQteCommande(int qteCommande) {
		this.qteCommande = qteCommande;
	}
	public String getDatePrevueLivraison() {
		return datePrevueLivraison;
	}
	public void setDatePrevueLivraison(String datePrevueLivraison) {
		this.datePrevueLivraison = datePrevueLivraison;
	} 
	
}
