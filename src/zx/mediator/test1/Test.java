package zx.mediator.test1;

public class Test {
	
	public static void main(String[] args) {
		//创建中介者
		ConcreteMediator concreteMediator = new ConcreteMediator();
		
		ConcreteColleague1 concreteColleague1 = new ConcreteColleague1(concreteMediator);
		ConcreteColleague2 concreteColleague2 = new ConcreteColleague2(concreteMediator);
		
		concreteMediator.setConcreteColleague1(concreteColleague1);
		concreteMediator.setConcreteColleague2(concreteColleague2);
		
		concreteColleague1.send("你吃过饭没啊？");
		concreteColleague2.send("吃过了");
		
	}

}
