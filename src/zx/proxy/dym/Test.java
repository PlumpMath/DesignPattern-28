package zx.proxy.dym;

import java.lang.reflect.Proxy;

/**
 * 注意：JDK内置的动态代理Proxy只能代理接口
 * (如果既想代理接口又想代理抽象类需要使用第三方组件：例如cglib)
 * @author Carl_Hugo
 * @date 2017年5月4日
 */
public class Test {
	
	public static void main(String[] args) {
		//实例化目标对象
		UserService userService = new UserServiceImpl();
		//实例化MyInvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		//根据目标对象创建代理对象
		UserService proxy = (UserService)invocationHandler.getProxy();
		/*UserService proxy = (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(),
				new Class[]{UserService.class}, invocationHandler);*/
		//执行代理对象的方法
        proxy.add();
	}

}
