package application_stock.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import application_stock.entities.Articles_Approvisionnement;
import application_stock.entities.Commande;
import application_stock.models.HibernateUtil;

public class ArtApprDao {

    public void ajouter(Articles_Approvisionnement article) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.save(article);
            sesion.getTransaction().commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            sesion.getTransaction().rollback();
        } finally {
            if (sesion != null) {
                sesion.close();
            }
        }
    }
    
	public List<Articles_Approvisionnement> listArticleAppr(){
		   List<Articles_Approvisionnement> list=null;
		 Session sesion = HibernateUtil.getSessionFactory().openSession();
		 Transaction t = sesion.beginTransaction();
		 String hql = "FROM Articles_Approvisionnement";
		 try {
			list=sesion.createQuery(hql).list();
			 t.commit();
	         sesion.close();
		 } catch (Exception e) {
	            t.rollback();
	        }
		 
		return list;
		
	}
	
}
