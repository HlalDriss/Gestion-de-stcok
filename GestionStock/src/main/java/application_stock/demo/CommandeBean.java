package application_stock.demo;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import application_stock.dao.ArtApprDao;
import application_stock.dao.CommandeDao;
import application_stock.entities.Articles_Approvisionnement;
import application_stock.entities.Commande;

@ViewScoped
@ManagedBean(name = "commandeManagedBean")
public class CommandeBean {
	private List<Commande> listCommandes;
    private Commande commande;
   private List<Articles_Approvisionnement> approvisionnements;
	

	public List<Articles_Approvisionnement> getApprovisionnements() {
		ArtApprDao apprDao =new ArtApprDao();
		approvisionnements=apprDao.listArticleAppr();
	return approvisionnements;
}

public void setApprovisionnements(List<Articles_Approvisionnement> approvisionnements) {
	this.approvisionnements = approvisionnements;
}

	public void setListCommandes(List<Commande> listCommandes) {
		this.listCommandes = listCommandes;
	}

	public Commande getCommande() {
		return commande;
	}

	public void setCommande(Commande commande) {
		this.commande = commande;
	}



    public List<Commande> getListCommandes(){
    	 CommandeDao cd=new CommandeDao();
    	 listCommandes=cd.listCommande();
    	return listCommandes;
    }
   public void nettoyerCommande(){
    	commande=new Commande();
    }
    
    public void supprimerCommande() {
        CommandeDao dao =new CommandeDao();
        dao.supprimerCom(commande);
        nettoyerCommande();
    }
    public void prevuCommande(){
    	ArtApprDao apprDao =new ArtApprDao();
    	DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
    	Date dateobj = new Date();
         Articles_Approvisionnement approvisionnement=new Articles_Approvisionnement(commande.getCodeArt(),
     			commande.getQteCmd(),df.format(dateobj));
    	apprDao.ajouter(approvisionnement);
    	 CommandeDao dao =new CommandeDao();
         dao.supprimerCom(commande);
         nettoyerCommande();
    }
	
}
