package zx.bridge.test2;

public abstract class Implementor {
	public abstract void operation();
}

class ConcreteImplementA extends Implementor{
	@Override
	public void operation() {
		System.out.println("����ʵ����A��ʵ��");
	}
}

class ConcreteImplementB extends Implementor{
	@Override
	public void operation() {
		System.out.println("����ʵ����B��ʵ��");
	}
}