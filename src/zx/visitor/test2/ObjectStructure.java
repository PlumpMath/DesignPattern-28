package zx.visitor.test2;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	
	private List<Person> elements = new ArrayList<Person>();
	
	//增加
	public void attach(Person person){
		elements.add(person);
	}
	
	//移除
	public void detach(Person person){
		elements.remove(person);
	}

	//查看显示
	public void display(Action visitor){
		for(Person p:elements){
			p.accept(visitor);
		}
	}
}
