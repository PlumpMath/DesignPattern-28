package zx.visitor.test3;

import java.util.ArrayList;

public class ObjectStructure {
	
	private ArrayList<Element> elements = new ArrayList<Element>();
	
	public void attach(Element element){
		elements.add(element);
	}
	
	public void detach(Element element){
		elements.remove(element);
	}
	
	public void accept(Visitor visitor){
		for(Element e:elements){
			e.accept(visitor);
		}
	}

}
