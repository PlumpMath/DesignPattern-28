package zx.builder.test1;

public class Test {
	
	public static void main(String[] args) {
		Director director = new Director();
		ConcreteBuilder1 concreteBuilder1 = new ConcreteBuilder1();
		ConcreteBuilder2 concreteBuilder2 = new ConcreteBuilder2();
		
		director.Construct(concreteBuilder1);
		Product product1 = concreteBuilder1.GetResult();
		product1.show();
		
		
		director.Construct(concreteBuilder2);
		Product product2 = concreteBuilder2.GetResult();
		product2.show();
		
	}

}
