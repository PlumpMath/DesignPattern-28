package zx.adapterpattern.test1;

public class Target {
	//�ͻ������ڴ��Ľӿ�
	public void request(){
		System.out.println("��ͨ����");
	}
}

class Adaptee {
	public void specificRequest() {
		System.out.println("��������");
	}
}

class Adapter extends Target{
	
	private Adaptee adaptee=new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
