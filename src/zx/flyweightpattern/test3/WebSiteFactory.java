package zx.flyweightpattern.test3;

import java.util.Hashtable;

public class WebSiteFactory {
	
	private Hashtable flyweights=new Hashtable();
	
	//获得网站分类
	public WebSite getWebSiteCatagory(String key){
		if(!flyweights.containsKey(key)){
			flyweights.put(key,new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	//获取网站总类数
	public int getWebSiteCount(){
		return flyweights.size();
	}

}


