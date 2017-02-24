package zx.flyweightpattern.test3;

import java.util.Hashtable;

public class WebSiteFactory {
	
	private Hashtable flyweights=new Hashtable();
	
	//�����վ����
	public WebSite getWebSiteCatagory(String key){
		if(!flyweights.containsKey(key)){
			flyweights.put(key,new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	//��ȡ��վ������
	public int getWebSiteCount(){
		return flyweights.size();
	}

}


