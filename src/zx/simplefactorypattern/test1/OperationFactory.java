package zx.simplefactorypattern.test1;

public class OperationFactory {
	
	public static Operation createOperation(String operate){
		Operation opera=null;
		switch(operate){
			case "+": opera=new OperationAdd();	break;
			case "-": opera=new OperationSub(); break;
			case "*": opera=new OperationMul(); break;
			case "/": opera=new OperationDiv(); break;
		}
		return opera;
	}

}
