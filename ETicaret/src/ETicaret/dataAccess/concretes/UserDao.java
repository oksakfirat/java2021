package ETicaret.dataAccess.concretes;

import ETicaret.dataAccess.abstracts.IUserDao;
import ETicaret.entities.concretes.User;

public class UserDao implements IUserDao {

	@Override
	public void userAdd(User user) {
		System.out.println("Kullanıcı Kayıt yapıldı: "+ user.getFirstName());
		
	}

	@Override
	public void userLogin(User user) {
		System.out.println("Kullanıcı girişi yapıldı: "+user.getFirstName()+" "+ user.getLastName());
		
	}

}
