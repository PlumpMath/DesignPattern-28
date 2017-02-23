package zx.observerpattern.test1;

import java.util.ArrayList;
import java.util.List;

public class Secretary {
	
	//同事列表
	private List<StockObserver> observers=new ArrayList<StockObserver>();
	private String action;
	//增加
	public void attach(StockObserver observer){
		observers.add(observer);
	}
	
	public void inform(){
		for(StockObserver s:observers){
			s.update();
		}
	}
	
	//前台状态
	public String SecretaryAction;
	
	public String getSecretaryAction() {
		return SecretaryAction;
	}

	public void setSecretaryAction(String secretaryAction) {
		SecretaryAction = secretaryAction;
	}
	
	

}
