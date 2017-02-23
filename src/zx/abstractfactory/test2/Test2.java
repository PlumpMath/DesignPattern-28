package zx.abstractfactory.test2;

import zx.abstractfactory.test2.entity.Department;
import zx.abstractfactory.test2.entity.User;

public class Test2 {

	public static void main(String[] args) {
		User user = new User();
		Department department = new Department();
		IUser iu = DataAccess.createUser();
		IDepartment id = DataAccess.createDepartment();
		
		iu.insert(user);
		iu.getUser(1);
		
		id.insert(department);
		id.getUser(1);
		
	}
}
