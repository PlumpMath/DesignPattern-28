package zx.abstractfactory.test2;

import zx.abstractfactory.test2.entity.User;

public interface IUser {
	
	void insert(User user);
	
	User getUser(int id);

}
