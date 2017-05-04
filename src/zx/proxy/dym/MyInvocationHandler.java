package zx.proxy.dym;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 此类需要实现InvocationHandler接口
 * 调用处理器，当代理对象调用代理方法的时候，注册在调用处理器中的invoke方法会自动调用
 * @author Carl_Hugo
 * @date 2017年5月4日
 */
public class MyInvocationHandler implements InvocationHandler{

	//目标对象，通过反射机制获得
	private Object target;
	//构造方法
	public MyInvocationHandler(Object target) {
		super();
		this.target=target;
	}
	
	/**
	 * 执行目标对象的方法
	 * 参数：Object proxy 代理对象的引用，proxy变量中保存代理对象的内存地址
	 *      Method method 目标对象的目标方法
	 *      Object[] args:目标对象的目标方法执行的时候需要实参
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//开始时间
		long begin = System.currentTimeMillis();
		System.out.println("==============开始==============");
		//执行目标对象中的方法
		Object retValue = method.invoke(target, args);
		//结束时间
		long end = System.currentTimeMillis();
		//计算时间
		System.out.println("==============结束==============");
		System.out.println("耗费时长："+(end-begin)+"ms");
		return retValue;
	}
	
	/**
	 * 获取目标对象的代理对象
	 * @return
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				target.getClass().getInterfaces(), this);
	}

}
