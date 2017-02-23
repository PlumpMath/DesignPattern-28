package zx.abstractfactory.test2.sqlserver;

import zx.abstractfactory.test2.IDepartment;
import zx.abstractfactory.test2.entity.Department;

public class SqlServerDepartment implements IDepartment{

	@Override
	public void insert(Department d) {
		System.out.println("在SQL Server中给department表增加一条记录");
	}

	@Override
	public Department getUser(int id) {
		System.out.println("在SQL Server中根据ID获取department表中的一条记录");
		return null;
	}

}
