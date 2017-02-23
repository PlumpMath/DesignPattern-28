package zx.abstractfactory.test2;

import zx.abstractfactory.test2.access.AccessDepartment;
import zx.abstractfactory.test2.access.AccessUser;
import zx.abstractfactory.test2.sqlserver.SqlServerDepartment;
import zx.abstractfactory.test2.sqlserver.SqlServerUser;

public class DataAccess {
	
	private static final String db="SqlServer";
//	private static final String db="Access";
	
	public static IUser createUser(){
		IUser result=null;
		switch(db){
		case "SqlServer":result=new SqlServerUser(); break;
		case "Access":result=new AccessUser();break;
		}
		return result;
	}
	
	public static IDepartment createDepartment(){
		IDepartment result=null;
		switch(db){
		case "SqlServer":result=new SqlServerDepartment(); break;
		case "Access":result=new AccessDepartment();break;
		}
		return result;
	}

}
