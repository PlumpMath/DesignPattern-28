package zx.visitor.test3;

public abstract class Visitor {
	
	public abstract void visitConcreteElementA(ConcreteElementA concreteElementA);
	
	public abstract void visitConcreteElementB(ConcreteElementB concreteElementB);

}

class ConcreteVisitor1 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()
				+"被"+this.getClass().getSimpleName()+"访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()
				+"被"+this.getClass().getSimpleName()+"访问");
	}
}

class ConcreteVisitor2 extends Visitor{

	@Override
	public void visitConcreteElementA(ConcreteElementA concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()
				+"被"+this.getClass().getSimpleName()+"访问");
	}

	@Override
	public void visitConcreteElementB(ConcreteElementB concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()
				+"被"+this.getClass().getSimpleName()+"访问");
	}
}
