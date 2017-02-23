	package zx.factorymethod.test1;
	
	public class Test {
		
		public static void main(String[] args) throws Exception {
			AddFactory addFactory = new AddFactory();
			Operation operationAdd = addFactory.createOperation();
			System.out.println(operationAdd.getResult(1, 1));
		}
	
	}
