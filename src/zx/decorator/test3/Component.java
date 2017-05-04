package zx.decorator.test3;

public interface Component {
	
	public abstract void operation();

}

class ConcreteComponent implements Component{

	@Override
	public void operation() {
		System.out.println("具体对象的操作");
	}
}

