package zx.mediator.test1;
/**
 * ������н����࣬���ڴ�����Ϣ
 * @author Carl_Hugo
 */
public abstract class Mediator {
	//����Ϣ���͸��Է�
	public abstract void send(String message,Colleague colleague);

}

class ConcreteMediator extends Mediator{
    //�����н�����Ҫ������Ϣ�Ķ���
	private ConcreteColleague1 concreteColleague1;
	private ConcreteColleague2 concreteColleague2;
	
	/**
	 * �����н��߷�����Ϣ��ʵ��
	 */
	@Override
	public void send(String message, Colleague colleague) {
		//colleague�Ƿ���ConcreteColleague��һ��ʵ��
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