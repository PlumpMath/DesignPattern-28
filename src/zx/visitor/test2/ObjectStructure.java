package zx.visitor.test2;

import java.util.ArrayList;
import java.util.List;

public class ObjectStructure {
	
	private List<Person> elements = new ArrayList<Person>();
	
	//����
	public void attach(Person person){
		elements.add(person);
	}
	
	//�Ƴ�
	public void detach(Person person){
		elements.remove(person);
	}

	//�鿴��ʾ
	public void display(Action visitor){
		for(Person p:elements){
			p.accept(visitor);
		}
	}
}
