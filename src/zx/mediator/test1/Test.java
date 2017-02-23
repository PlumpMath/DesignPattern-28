package zx.mediator.test1;

public class Test {
	
	public static void main(String[] args) {
		//�����н���
		ConcreteMediator concreteMediator = new ConcreteMediator();
		
		ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
		ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);
		
		concreteMediator.setConcreteColleague1(concreteColleague1);
		concreteMediator.setConcreteColleague2(concreteColleague2);
		
		concreteColleague1.send("��Թ���û����");
		concreteColleague2.send("�Թ���");
		
	}

}
