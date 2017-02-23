package zx.decorator.test2;

public class Finery extends Person{
	
	protected Person component;
	
	//װ��
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
		System.out.println("��T��");
	}
}

class BigTrouser extends Finery{

	@Override
	public void show() {
		super.show();
		System.out.println("���");
	}
}

class Sneakers extends Finery{

	@Override
	public void show() {
		super.show();
		System.out.println("�˶�Ь");
	}
}

