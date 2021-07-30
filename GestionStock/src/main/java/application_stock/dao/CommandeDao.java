package application_stock.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import application_stock.entities.Article;
import application_stock.entities.Commande;
import application_stock.models.HibernateUtil;

public class CommandeDao {

	public List<Commande> listCommande(){
		   List<Commande> list=null;
		 Session sesion = HibernateUtil.getSessionFactory().openSession();
		 Transaction t = sesion.beginTransaction();
		 String hql = "FROM Commande";
		 try {
			list=sesion.createQuery(hql).list();
			 t.commit();
	         sesion.close();
		 } catch (Exception e) {
	            t.rollback();
	        }
		 
		return list;
		
	}
	
    public void supprimerCom(Commande commande) {
        Session sesion = null;
        try {
            sesion = HibernateUtil.getSessionFactory().openSession();
            sesion.beginTransaction();
            sesion.delete(commande);
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
	
	
}
