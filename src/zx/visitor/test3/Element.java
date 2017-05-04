package zx.visitor.test3;

public abstract class Element {
	
	public abstract void accept(Visitor visitor);
}

class ConcreteElementA extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementA(this);
	}
}

class ConcreteElementB extends Element{

	@Override
	public void accept(Visitor visitor) {
		visitor.visitConcreteElementB(this);
	}
}