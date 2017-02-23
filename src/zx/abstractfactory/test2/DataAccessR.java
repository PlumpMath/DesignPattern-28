package zx.abstractfactory.test2;

import zx.abstractfactory.test2.sqlserver.SqlServerDepartment;
import zx.abstractfactory.test2.sqlserver.SqlServerUser;

public class DataAccessR {
	
	private static final String commonPackageName="zx.abstractfactory.test2";
	private static final String db="sqlserver";
	
	public static IUser createUser() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		String className=commonPackageName+"."+db+".SqlServerUser";
		System.out.println("SqlServerUser的全路径名 "+className);
		IUser sqlServerUser=(SqlServerUser)Class.forName(className).newInstance();
		return sqlServerUser;
	}
	
	public static IDepartment createDepartment() throws InstantiationException, IllegalAccessException, ClassNotFoundException{
		String className=commonPackageName+"."+db+".SqlServerDepartment";
		System.out.println("SqlServerDepartment的全路径名 "+className);
		IDepartment sqlServerDepartment=(SqlServerDepartment)Class.forName(className).newInstance();
		return sqlServerDepartment;
		
	}

	
}
