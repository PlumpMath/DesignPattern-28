package zx.mediator.test1;

public class Colleague {
	//每个同事内部维护一个中介者
	protected Mediator mediator;
	//创建同事时将中介者传入
	public Colleague(Mediator mediator){
		this.mediator=mediator;
	}
}

class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void inform(String message){
		System.out.println("同事1得到消息:"+message);
	}
	//通过中介，发送消息
	public void send(String message){
		mediator.send(message, this);
	}
}

class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void inform(String message){
		System.out.println("同事2得到消息:"+message);
	}
	//通过中介，发送消息
	public void send(String message){
		mediator.send(message, this);
	}
	
}