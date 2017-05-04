package zx.proxy.dym;

import java.lang.reflect.Proxy;

public class UserServiceImpl implements UserService{
	
	@Override
	public void add() {
		System.out.println("----------add-------------");
	}

}
