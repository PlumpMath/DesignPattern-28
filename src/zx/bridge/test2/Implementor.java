package zx.bridge.test2;

public abstract class Implementor {
	public abstract void operation();
}

class ConcreteImplementA extends Implementor{
	@Override
	public void operation() {
		System.out.println("具体实现类A的实现");
	}
}

class ConcreteImplementB extends Implementor{
	@Override
	public void operation() {
		System.out.println("具体实现类B的实现");
	}
}