package zx.abstractfactory.test2.sqlserver;

import zx.abstractfactory.test2.IDepartment;
import zx.abstractfactory.test2.entity.Department;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department d) {
		System.out.println("��SQL Server�и�department������һ����¼");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("��SQL Server�и���ID��ȡdepartment���е�һ����¼");
		return null;
	}

}
