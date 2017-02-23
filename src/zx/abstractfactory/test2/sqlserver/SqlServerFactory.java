package zx.abstractfactory.test2.sqlserver;

import zx.abstractfactory.test2.IDepartment;
import zx.abstractfactory.test2.IFactory;
import zx.abstractfactory.test2.IUser;

public class SqlServerFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new SqlServerUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new SqlServerDepartment();
	}

}
