package zx.factorymethod.test1;


public interface Operation {
	public double getResult(double number1,double number2) throws Exception;
}


class OperationAdd implements Operation{
	@Override
	public double getResult(double number1, double number2) {
		double result=0;
		return result=number1+number2;
	}

}

class OperationSub implements Operation{

	@Override
	public double getResult(double number1, double number2) {
		double result=0;
		return result=number1-number2;
	}
}

class OperationMul implements Operation{

	@Override
	public double getResult(double number1, double number2) {
		double result=0;
		return result=number1*number2;
	}
}

class OperationDiv implements Operation{
	@Override
	public double getResult(double number1, double number2) throws Exception {
		double result=0;
		if(number2==0){
			throw new Exception("除数不能为0");
		}
			result=number1/number2;
		return result;
	}
}
