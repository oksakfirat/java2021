package ETicaret.business.abstracts;

import ETicaret.entities.concretes.User;

public interface IUserService {
	public void add(User user);
	public void login(User user);
}
