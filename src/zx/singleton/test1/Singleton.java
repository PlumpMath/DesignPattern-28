package zx.singleton.test1;

public class Singleton {
	
	private static Singleton instance;
	//˽�л����캯��
	private Singleton(){}
	//���������ľ�̬������ȡ����ʵ��
	/**
	 * ��instanceΪnullʱ,����ͬʱ�������̵߳���getInstance()����ʱ,
	 * ���Ƕ�������һ��instance==null���жϡ����������ƣ��������߳�ֻ��һ�����룬
	 * ��һ���������Ŷӡ�����һ��������ʵ�������û�еڶ���instance==null���жϣ�
	 * ��Ķ����̻߳�����������ʵ�����Ͳ��ܴﵽ������Ŀ�ġ�
	 * @return
	 */
	public static Singleton getInstance(){
		if(instance==null){
			synchronized ("lock") {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}

}
