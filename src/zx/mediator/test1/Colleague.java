package zx.mediator.test1;

public class Colleague {
	//ÿ��ͬ���ڲ�ά��һ���н���
	protected Mediator mediator;
	//����ͬ��ʱ���н��ߴ���
	public Colleague(Mediator mediator){
		this.mediator=mediator;
	}
}

class ConcreteColleague1 extends Colleague{

	public ConcreteColleague1(Mediator mediator) {
		super(mediator);
	}
	
	public void inform(String message){
		System.out.println("ͬ��1�õ���Ϣ:"+message);
	}
	//ͨ���н飬������Ϣ
	public void send(String message){
		mediator.send(message, this);
	}
}

class ConcreteColleague2 extends Colleague{

	public ConcreteColleague2(Mediator mediator) {
		super(mediator);
	}
	
	public void inform(String message){
		System.out.println("ͬ��2�õ���Ϣ:"+message);
	}
	//ͨ���н飬������Ϣ
	public void send(String message){
		mediator.send(message, this);
	}
	
}