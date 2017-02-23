package zx.bridge.test2;

public class Test {
	
	public static void main(String[] args) {
		RefinedAbstraction refinedAbstraction = new RefinedAbstraction();
		
		refinedAbstraction.setImplementor(new ConcreteImplementA());
		refinedAbstraction.operation();
		
		refinedAbstraction.setImplementor(new ConcreteImplementB());
		refinedAbstraction.operation();
		
	}

}
