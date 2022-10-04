package ETicaret.business.concretes;

import java.util.regex.Pattern;

import ETicaret.entities.concretes.User;

public class ControlManager {

	public boolean password(User user) {
		 int password= user.getPassword().length();
		  boolean dogruMu=true;
	        if(password>=6){
	        	return dogruMu;
	            
	        }else{
	            System.out.println("Gecersiz sifre");
	            return dogruMu;
	        }
	       
	  }
	 public boolean emailControl(User user) {
    	String mail=user.getEmail();
        boolean et= Pattern.matches(".*@.*", mail);
        boolean dotCom=Pattern.matches(".*.com", mail);
        if (dotCom && et) {
        	return true;
        }
        else {
       	 System.out.println("Geçersiz Email");
       	 return false;
        }
		
	 }
	 public boolean nameContro(User user) {
		 boolean nameContro=true;
		 if (user.getFirstName().length()>2 && user.getLastName().length()>2) {
			return nameContro;
		}
		 else {
			 System.out.println("Geçersiz ad ve soyad");
			 return false;
		 }
	 }
		
}
