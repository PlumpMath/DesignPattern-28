package zx.bridge.test2;

public class RefinedAbstraction extends Abstraction{
	
	@Override
	public void operation() {
		implementor.operation();
	}

}
