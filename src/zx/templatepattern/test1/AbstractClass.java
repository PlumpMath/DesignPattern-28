package zx.templatepattern.test1;

public abstract class AbstractClass {
	
	//一些抽象行为放到子类中去实现
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//模版方法，给出逻辑的骨架，逻辑的组成是一些相应的抽象操作，他们都推迟到子类中去实现
	public void TemplateMethod(){
		primitiveOperation1();
		primitiveOperation2();
	}

}
