package zx.abstractfactory.test2.access;

import zx.abstractfactory.test2.IDepartment;
import zx.abstractfactory.test2.entity.Department;

public class AccessDepartment implements IDepartment{

	@Override
	public void insert(Department d) {
		System.out.println("��Access�и�department������һ����¼");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("��Access�и���ID��ȡdepartment���е�һ����¼");
		return null;
	}

}
