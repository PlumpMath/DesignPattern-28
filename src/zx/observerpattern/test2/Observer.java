package zx.observerpattern.test2;

public abstract class Observer {

	//protected 同一个包中可以访问，继承的子类可以访问
	protected String name;
	protected Subject sub;
	
	public abstract void update();
	
	public Observer(String name,Subject sub){
		this.name=name;
		this.sub=sub;
	}

}
