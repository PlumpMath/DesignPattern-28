package zx.simplefactorypattern.test1;

public class Test1 {
	
	public static void main(String[] args) throws Exception {
		Operation operationAdd = new OperationFactory().createOperation("+");
		Operation operationSub = new OperationFactory().createOperation("-");
		Operation operationMul = new OperationFactory().createOperation("*");
		Operation operationDiv = new OperationFactory().createOperation("/");
		double n1=123;
		double n2=0;
		System.out.println(operationAdd.getResult(n1, n2));
		System.out.println(operationSub.getResult(n1, n2));
		System.out.println(operationMul.getResult(n1, n2));
		System.out.println(operationDiv.getResult(n1, n2));
	}

}
