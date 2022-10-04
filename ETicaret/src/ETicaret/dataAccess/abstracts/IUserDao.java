package ETicaret.dataAccess.abstracts;

import ETicaret.entities.concretes.User;

public interface IUserDao {

	public void userAdd(User user);
	public void userLogin(User user);
}
