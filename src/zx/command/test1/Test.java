package zx.command.test1;

public class Test {

	public static void main(String[] args) {
		//��������Ľ�����
		Receiver receiver = new Receiver();
		//���������ִ������
		ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
		//�����������
		Invoker invoker = new Invoker();
		//��ִ���������ø��������
		invoker.setCommand(concreteCommand);
		//ִ������
		invoker.executeCommand();
	}
}
