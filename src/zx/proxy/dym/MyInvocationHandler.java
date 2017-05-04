package zx.proxy.dym;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * ������Ҫʵ��InvocationHandler�ӿ�
 * ���ô������������������ô�������ʱ��ע���ڵ��ô������е�invoke�������Զ�����
 * @author Carl_Hugo
 * @date 2017��5��4��
 */
public class MyInvocationHandler implements InvocationHandler{

	//Ŀ�����ͨ��������ƻ��
	private Object target;
	//���췽��
	public MyInvocationHandler(Object target) {
		super();
		this.target=target;
	}
	
	/**
	 * ִ��Ŀ�����ķ���
	 * ������Object proxy �����������ã�proxy�����б�����������ڴ��ַ
	 *      Method method Ŀ������Ŀ�귽��
	 *      Object[] args:Ŀ������Ŀ�귽��ִ�е�ʱ����Ҫʵ��
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		//��ʼʱ��
		long begin = System.currentTimeMillis();
		System.out.println("==============��ʼ==============");
		//ִ��Ŀ������еķ���
		Object retValue = method.invoke(target, args);
		//����ʱ��
		long end = System.currentTimeMillis();
		//����ʱ��
		System.out.println("==============����==============");
		System.out.println("�ķ�ʱ����"+(end-begin)+"ms");
		return retValue;
	}
	
	/**
	 * ��ȡĿ�����Ĵ������
	 * @return
	 */
	public Object getProxy(){
		return Proxy.newProxyInstance(Thread.currentThread().getContextClassLoader(),
				target.getClass().getInterfaces(), this);
	}

}
