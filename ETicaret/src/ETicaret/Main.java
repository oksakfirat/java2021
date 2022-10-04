package ETicaret;

import ETicaret.business.abstracts.IUserService;
import ETicaret.business.concretes.ControlManager;
import ETicaret.business.concretes.UserManager;
import ETicaret.core.JGoogleManagerAdapter;
import ETicaret.dataAccess.concretes.UserDao;
import ETicaret.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user=new User();
		user.setId(1);
		user.setFirstName("fırat");
		user.setLastName("Okşak");
		user.setEmail("firat@gmail.com");
		user.setPassword("123456");
		
		System.out.println("----------------------------");
		IUserService userService=new UserManager(new UserDao(),new ControlManager(),new JGoogleManagerAdapter());
		userService.add(user);
		userService.login(user);
		
		
		
		

	}

}
