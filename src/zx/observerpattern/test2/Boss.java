package zx.observerpattern.test2;

import java.util.ArrayList;
import java.util.List;

public class Boss extends Subject{

	//ͬ���б�
	//private ֻ�е�ǰ����Է���
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
