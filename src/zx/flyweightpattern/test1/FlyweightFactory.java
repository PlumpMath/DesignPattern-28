package zx.flyweightpattern.test1;

import java.util.HashMap;
/**
 * @author zhu_xiang 
 * Description:����String������Flyweight����
 */
public class FlyweightFactory {
	
	private HashMap flyweights=new HashMap();
	
	public FlyweightFactory(){
		flyweights.put("X", new ConcreteFlyweight());
		flyweights.put("Y", new ConcreteFlyweight());
		flyweights.put("Z", new ConcreteFlyweight());
	}
	
	public Flyweight getFlyweight(String key){
		return (Flyweight)flyweights.get(key);
	}

}
