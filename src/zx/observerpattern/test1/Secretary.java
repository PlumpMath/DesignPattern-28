package zx.observerpattern.test1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	
	//ͬ���б�
	private List<StockObserver> observers=new ArrayList<StockObserver>();
	private String action;
	//����
	public void attach(StockObserver observer){
		observers.add(observer);
	}
	
	public void inform(){
		for(StockObserver s:observers){
			s.update();
		}
	}
	
	//ǰ̨״̬
	public String SecretaryAction;
	
	public String getSecretaryAction() {
		return SecretaryAction;
	}

	public void setSecretaryAction(String secretaryAction) {
		SecretaryAction = secretaryAction;
	}
	
	

}
