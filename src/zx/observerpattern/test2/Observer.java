package zx.observerpattern.test2;

public abstract class Observer {

	//protected ͬһ�����п��Է��ʣ��̳е�������Է���
	protected String name;
	protected Subject sub;
	
	public abstract void update();
	
	public Observer(String name,Subject sub){
		this.name=name;
		this.sub=sub;
	}

}
