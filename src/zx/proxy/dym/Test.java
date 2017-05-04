package zx.proxy.dym;

import java.lang.reflect.Proxy;

/**
 * ע�⣺JDK���õĶ�̬����Proxyֻ�ܴ���ӿ�
 * (����������ӿ���������������Ҫʹ�õ��������������cglib)
 * @author Carl_Hugo
 * @date 2017��5��4��
 */
public class Test {
	
	public static void main(String[] args) {
		//ʵ����Ŀ�����
		UserService userService = new UserServiceImpl();
		//ʵ����MyInvocationHandler
		MyInvocationHandler invocationHandler = new MyInvocationHandler(userService);
		//����Ŀ����󴴽��������
		UserService proxy = (UserService)invocationHandler.getProxy();
		/*UserService proxy = (UserService)Proxy.newProxyInstance(UserService.class.getClassLoader(),
				new Class[]{UserService.class}, invocationHandler);*/
		//ִ�д������ķ���
        proxy.add();
	}

}
