package zx.iterator.test1;

public class Test {
	
	public static void main(String[] args) {
		//创建具体的集合类
		ConcreteAggregate concreteAggregate = new ConcreteAggregate();
		concreteAggregate.setByIndex(0,"大鸟");
		concreteAggregate.setByIndex(1,"小菜");
		concreteAggregate.setByIndex(2,"行李");
		concreteAggregate.setByIndex(3,"老外");
		concreteAggregate.setByIndex(4,"公交内部员工");
		concreteAggregate.setByIndex(5,"小偷");

		//通过集合类创建迭代器
		Iterator i = concreteAggregate.createIterator();
		//将具体集合类作为参数传入迭代器的构造函数中
//		ConcreteIterator i = new ConcreteIterator(concreteAggregate);
		Object first = i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"请买票");
			i.next();
		}
	}
}
