package zx.abstractfactory.test2;

import zx.abstractfactory.test2.entity.Department;
import zx.abstractfactory.test2.entity.User;
import zx.abstractfactory.test2.sqlserver.SqlServerFactory;

public class Test {
	
	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		
		SqlServerFactory sqlServerFactory = new SqlServerFactory();
		IUser createUser = sqlServerFactory.createUser();
		IDepartment createDepartment = sqlServerFactory.createDepartment();
		
		createUser.insert(user);
		createUser.getUser(1);
		createDepartment.insert(department);
		createDepartment.getUser(1);
	}

}
