package zx.visitor.test2;

public abstract class Person {

	public abstract void accept(Action visitor);
}

class Man extends Person{

	@Override
	public void accept(Action visitor) {
		visitor.getManConclusion(this);
	}
}

class Woman extends Person{

	@Override
	public void accept(Action visitor) {
		visitor.getWomanConclusion(this);
	}
}