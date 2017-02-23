package zx.observerpattern.test2;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject{

	//同事列表
	//private 只有当前类可以访问
	private List<Observer> observers=new ArrayList<Observer>();
	private String action;
	
	@Override
	public void attach(Observer observer) {
        observers.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		observers.remove(observer);
	}

	@Override
	public void inform() {
		for(Observer o:observers){
			o.update();
		}
	}

}
