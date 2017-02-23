package zx.mediator.test2;

public abstract class Country {
	
	protected UnitedNations mediator;
	
	public Country(UnitedNations mediator){
		this.mediator=mediator;
	}

}

class USA extends Country{

	public USA(UnitedNations mediator) {
		super(mediator);
	}
	
	//����
	public void declare(String message){
		mediator.declared(message, this);
	}
	
	//�����Ϣ
	public void getMessage(String message){
		System.out.println("������öԷ���Ϣ:"+message);
	}
}

class Irap extends Country{

	public Irap(UnitedNations mediator) {
		super(mediator);
	}
	
	//����
	public void declare(String message){
		mediator.declared(message, this);
	}
	
	//�����Ϣ
	public void getMessage(String message){
		System.out.println("�����˻�öԷ���Ϣ:"+message);
	}
}