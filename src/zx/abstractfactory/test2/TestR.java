package zx.abstractfactory.test2;

import zx.abstractfactory.test2.entity.Department;
import zx.abstractfactory.test2.entity.User;

public class TestR {
	
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {
		User user = new User();
		Department department = new Department();
		IUser createUser = DataAccessR.createUser();
		IDepartment createDepartment = DataAccessR.createDepartment();
		
		createUser.insert(user);
		createUser.getUser(1);
		
		createDepartment.insert(department);
		createDepartment.getUser(1);
		
		System.out.println("testR");
	}
}
