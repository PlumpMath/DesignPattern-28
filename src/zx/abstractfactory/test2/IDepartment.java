package zx.abstractfactory.test2;

import zx.abstractfactory.test2.entity.Department;

public interface IDepartment {
	
	void insert(Department department);
	
	Department getUser(int id);

}
