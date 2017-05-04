package zx.visitor.test3;

public class Test {
	
	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new ConcreteElementA());
		o.attach(new ConcreteElementB());
		ConcreteVisitor1 v1 = new ConcreteVisitor1();
		ConcreteVisitor2 v2 = new ConcreteVisitor2();
		
		o.accept(v1);
		o.accept(v2);
		
	}

}
