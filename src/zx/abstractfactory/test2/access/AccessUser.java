package zx.abstractfactory.test2.access;

import zx.abstractfactory.test2.IUser;
import zx.abstractfactory.test2.entity.User;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("在Access中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在Access中根据ID获取User表中的一条记录");
		return null;
	}

}
