package zx.singleton.test1;
/**
 * ��������ģʽ 
 * @author Carl_Hugo
 */
//��֯���౻�̳У���ֹ�����µ�ʵ��
public final class Singleton2 {
	//��һ����������κγ�Աʱ����ʵ�������౻����ʱ����ʵ��
	private static final Singleton2 singleton2=new Singleton2();
	//˽�л����캯��
	private Singleton2(){}
	//���������ľ�̬������ȡʵ��
	public static Singleton2 getInstance(){
		return singleton2;
	}

}
