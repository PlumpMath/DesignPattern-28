package zx.mediator.test1;
/**
 * 抽象的中介者类，用于传送消息
 * @author Carl_Hugo
 */
public abstract class Mediator {
	//将消息发送给对方
	public abstract void send(String message,Colleague colleague);

}

class ConcreteMediator extends Mediator{
    //具体中介者需要传递消息的对象
	private ConcreteColleague1 concreteColleague1;
	private ConcreteColleague2 concreteColleague2;
	
	/**
	 * 具体中介者发送消息的实现
	 */
	@Override
	public void send(String message, Colleague colleague) {
		//colleague是否是ConcreteColleague的一个实例
		if(colleague instanceof ConcreteColleague1){
			concreteColleague2.inform(message);
		}else{
			concreteColleague1.inform(message);
		}
	}

	public void setConcreteColleague1(ConcreteColleague1 concreteColleague1) {
		this.concreteColleague1 = concreteColleague1;
	}

	public void setConcreteColleague2(ConcreteColleague2 concreteColleague2) {
		this.concreteColleague2 = concreteColleague2;
	}
	
}