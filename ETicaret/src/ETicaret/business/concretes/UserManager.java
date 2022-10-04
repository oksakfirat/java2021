package ETicaret.business.concretes;

import ETicaret.business.abstracts.IUserService;
import ETicaret.core.IGoogleService;
import ETicaret.dataAccess.abstracts.IUserDao;
import ETicaret.entities.concretes.User;

public class UserManager implements IUserService {

	IUserDao userDao;
	ControlManager controlManager;
	IGoogleService googleService;
	public UserManager(IUserDao userDao,ControlManager controlManager,IGoogleService googleService) {
		this.userDao=userDao;
		this.controlManager=controlManager;
		this.googleService=googleService;
	}
	@Override
	public void add(User user) {
		if (controlManager.emailControl(user)&&controlManager.nameContro(user)&&controlManager.password(user)) {
			userDao.userAdd(user);
			googleService.addGoogle(user);
			
		}
		
	}

	@Override
	public void login(User user) {
		if (user.getEmail()=="firat@gmail.com" && user.getPassword()=="123456") {
			userDao.userLogin(user);
			googleService.loginGoogle(user);
		}
		else {
			System.out.println("Giriş yapılamadı...");
		}
	
		
	}

}
