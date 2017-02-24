package zx.flyweightpattern.test2;

import java.util.Hashtable;

public class WebSiteFactory {
	
	private Hashtable flyweights=new Hashtable();
	
	/**
	 * �����վ����
	 */
	public WebSite getWebSiteCatagory(String key){
		//���������ʵ���򴴽�һ��ʵ����ʵ�ָ���
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	/**
	 * �����վ����
	 */
	public int getWebSiteCount(){
		return flyweights.size();
	}
	

}
