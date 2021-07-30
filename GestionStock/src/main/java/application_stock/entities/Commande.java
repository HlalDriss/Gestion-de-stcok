package application_stock.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Commande implements Serializable {
    
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	private Integer codeCmd;
     private String client;
     private Integer codeArt;
     private int qteCmd;
     private Date dateCmd;
     
	public Commande() {
		super();
	}
	
	
	public Commande(Integer codeCmd, String client, Integer codeArt, int qteCmd, Date dateCmd) {
		super();
		this.codeCmd = codeCmd;
		this.client = client;
		this.codeArt = codeArt;
		this.qteCmd = qteCmd;
		this.dateCmd = dateCmd;
	}


	public Integer getCodeCmd() {
		return codeCmd;
	}
	public void setCodeCmd(Integer codeCmd) {
		this.codeCmd = codeCmd;
	}
	public String getClient() {
		return client;
	}
	public void setClient(String client) {
		this.client = client;
	}
	public Integer getCodeArt() {
		return codeArt;
	}
	public void setCodeArt(Integer codeArt) {
		this.codeArt = codeArt;
	}
	public int getQteCmd() {
		return qteCmd;
	}
	public void setQteCmd(int qteCmd) {
		this.qteCmd = qteCmd;
	}
	public Date getDateCmd() {
		return dateCmd;
	}
	public void setDateCmd(Date dateCmd) {
		this.dateCmd = dateCmd;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
} 
