package zx.abstractfactory.test2.sqlserver;

import zx.abstractfactory.test2.IUser;
import zx.abstractfactory.test2.entity.User;

public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("��SQL Server�и�User������һ����¼");
	}

	@Override
	public User getUser(int id) {
		System.out.println("��SQL Server�и���ID��ȡUser���е�һ����¼");
		return null;
	}

}
