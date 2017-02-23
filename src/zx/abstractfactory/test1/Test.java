package zx.abstractfactory.test1;

public class Test {
	
	public static void main(String[] args) {
		User user = new User();
		SqlserverUser sqlserverUser = new SqlserverUser();
		sqlserverUser.insert(user);
		sqlserverUser.getUser(1);
	}

}
