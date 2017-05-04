package zx.decorator.test3;

public abstract class Decorator implements Component{
	
	protected Component component;

	public void setComponent(Component component) {
		this.component = component;
	}
	
    @Override
    public void operation() {
    	if(component!=null){
    		component.operation();
    	}
    }
}

class ConcreteDecoratorA extends Decorator{
	
	private String addedState;
	
	@Override
	public void operation() {
		super.operation();
		addedState="New State";
		System.out.println("����װ�ζ���A�Ĳ���");
	}

}

class ConcreteDecoratorB extends Decorator{
	
	@Override
	public void operation() {
		super.operation();
		AddedBehavior();
		System.out.println("����װ�ζ���B�Ĳ���");
	}
	
	private void AddedBehavior(){
		
	}
}
