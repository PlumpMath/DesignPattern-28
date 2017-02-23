package zx.chainofresponsibility.test1;

public class Test {

	public static void main(String[] args) {
		ConcreteHandler1 h1 = new ConcreteHandler1();
		ConcreteHandler2 h2 = new ConcreteHandler2();
		ConcreteHandler3 h3 = new ConcreteHandler3();
		
		h1.setSuccessor(h2);
		h2.setSuccessor(h3);
		
		int[] request={2,5,14,22,18,3,27,20};
		for(int i:request){
			h1.HandlerRequest(i);
		}
	}
}
