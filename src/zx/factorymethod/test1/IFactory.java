package zx.factorymethod.test1;

public interface IFactory {
	
	Operation createOperation();

}

class AddFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationAdd();
	}
}

class SubFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationSub();
	}
}

class MulFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationMul();
	}
}

class DivFactory implements IFactory{
	@Override
	public Operation createOperation() {
		return new OperationDiv();
	}
}