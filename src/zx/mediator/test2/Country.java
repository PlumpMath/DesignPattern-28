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
	
	//声明
	public void declare(String message){
		mediator.declared(message, this);
	}
	
	//获得消息
	public void getMessage(String message){
		System.out.println("美国获得对方信息:"+message);
	}
}

class Irap extends Country{

	public Irap(UnitedNations mediator) {
		super(mediator);
	}
	
	//声明
	public void declare(String message){
		mediator.declared(message, this);
	}
	
	//获得消息
	public void getMessage(String message){
		System.out.println("伊拉克获得对方信息:"+message);
	}
}