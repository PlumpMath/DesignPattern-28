package zx.abstractfactory.test2.access;

import zx.abstractfactory.test2.IUser;
import zx.abstractfactory.test2.entity.User;

public class AccessUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("��Access�и�User������һ����¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("��Access�и���ID��ȡUser���е�һ����¼");
		return null;
	}

}
