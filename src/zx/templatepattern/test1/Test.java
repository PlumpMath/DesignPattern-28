package zx.templatepattern.test1;

public class Test {
	
	public static void main(String[] args) {
		AbstractClass a;
		a=new ConcreteClassA();
		a.TemplateMethod();
		
		a=new ConcreteClassB();
		a.TemplateMethod();
	}

}
