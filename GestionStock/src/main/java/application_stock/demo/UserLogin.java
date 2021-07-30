package application_stock.demo;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;



public class UserLogin {
   private String userName;
   private String passWord;
public String getUserName() {
	return userName;
}
public void setUserName(String userName) {
	this.userName = userName;
}
public String getPassWord() { 	
	return passWord;
}
public void setPassWord(String passWord) {
	this.passWord = passWord;
}
  
public String loginUser(){
	if ("admin".equals(getUserName()) && "admin".equals(getPassWord())) {
		return "success";
	}
	FacesContext facesContext=FacesContext.getCurrentInstance();
	FacesMessage msg =new FacesMessage("erreur");
	facesContext.addMessage("loginForm", msg);
	return "failure";
		
}


}
