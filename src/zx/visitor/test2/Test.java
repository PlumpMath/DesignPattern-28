package zx.visitor.test2;

public class Test {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		//�ɹ�ʱ�ķ�Ӧ
		Success v1 = new Success();
		o.display(v1);
		//ʧ��ʱ�ķ�Ӧ
		Failing f1 = new Failing();
		o.display(f1);
		//����ʱ�ķ�Ӧ
		Amativeness a1 = new Amativeness();
		o.display(a1);
		//
		Marriage m4 = new Marriage();
		o.display(m4);
	}
}
