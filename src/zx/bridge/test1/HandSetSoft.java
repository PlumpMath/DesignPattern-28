package zx.bridge.test1;
/**
 * �ֻ����
 * @author Carl_Hugo
 */
public abstract class HandSetSoft {
	
	public abstract void run();

}

class HandSetGame extends HandSetSoft{
	@Override
	public void run() {
		System.out.println("�����ֻ���Ϸ");
	}
}

class HandSetAddressList extends HandSetSoft{
	@Override
	public void run() {
		System.out.println("�����ֻ�ͨѶ¼");
	}
}