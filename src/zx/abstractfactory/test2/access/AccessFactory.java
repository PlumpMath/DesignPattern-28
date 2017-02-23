package zx.abstractfactory.test2.access;

import zx.abstractfactory.test2.IDepartment;
import zx.abstractfactory.test2.IFactory;
import zx.abstractfactory.test2.IUser;

public class AccessFactory implements IFactory{

	@Override
	public IUser createUser() {
		return new AccessUser();
	}

	@Override
	public IDepartment createDepartment() {
		return new AccessDepartment();
	}

}
