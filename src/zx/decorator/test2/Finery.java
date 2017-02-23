package zx.decorator.test2;

public class Finery extends Person{
	
	protected Person component;
	
	//装扮
	public void Decorator(Person component){
		this.component=component;
	}
	
	@Override
	public void show() {
		if(component!=null){
			component.show();
		}
	}
}

class TShirts extends Finery{
	@Override
	public void show() {
		super.show();
		System.out.println("大T恤");
	}
}

class BigTrouser extends Finery{

	@Override
	public void show() {
		super.show();
		System.out.println("跨裤");
	}
}

class Sneakers extends Finery{

	@Override
	public void show() {
		super.show();
		System.out.println("运动鞋");
	}
}

