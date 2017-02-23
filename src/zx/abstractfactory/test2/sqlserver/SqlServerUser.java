package zx.abstractfactory.test2.sqlserver;

import zx.abstractfactory.test2.IUser;
import zx.abstractfactory.test2.entity.User;

public class SqlServerUser implements IUser{

	@Override
	public void insert(User user) {
		System.out.println("在SQL Server中给User表增加一条记录");
	}

	@Override
	public User getUser(int id) {
		System.out.println("在SQL Server中根据ID获取User表中的一条记录");
		return null;
	}

}
