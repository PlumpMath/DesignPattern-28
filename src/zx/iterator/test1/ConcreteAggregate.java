package zx.iterator.test1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

	//创建list集合
	private List<Object> items=new ArrayList<Object>();
	
	//创建该集合的迭代器
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	//返回集合中对象的数量
	public int count(){
		return items.size(); 
	}
	
	//获取和设置集合中的元素
	public Object getByIndex(int index){
		return items.get(index);
	}
	public void setByIndex(int index,Object value){
		items.add(index, value);
	}

}
