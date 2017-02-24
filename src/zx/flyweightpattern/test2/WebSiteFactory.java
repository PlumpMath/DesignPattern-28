package zx.flyweightpattern.test2;

import java.util.Hashtable;

public class WebSiteFactory {
	
	private Hashtable flyweights=new Hashtable();
	
	/**
	 * 获得网站分类
	 */
	public WebSite getWebSiteCatagory(String key){
		//如果不存在实例则创建一个实例，实现复用
		if(!flyweights.containsKey(key)){
			flyweights.put(key, new ConcreteWebSite(key));
		}
		return (WebSite)flyweights.get(key);
	}
	
	/**
	 * 获得网站总数
	 */
	public int getWebSiteCount(){
		return flyweights.size();
	}
	

}
