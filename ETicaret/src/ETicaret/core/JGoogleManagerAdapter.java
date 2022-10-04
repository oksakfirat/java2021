package ETicaret.core;

import ETicaret.entities.concretes.User;
import ETicaret.jGoogle.JGoogleManager;

public class JGoogleManagerAdapter implements IGoogleService {

	JGoogleManager googleManager=new JGoogleManager();
	@Override
	public void addGoogle(User user) {
		System.out.println("Google ile Eklendi: "+user.getFirstName());
		
	}

	@Override
	public void loginGoogle(User user) {
		System.out.println("Google ile Giriş Yaptı: "+user.getFirstName());
		
	}

}
