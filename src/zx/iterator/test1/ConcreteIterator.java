package zx.iterator.test1;

public class ConcreteIterator extends Iterator{

	//具体集合类
	private ConcreteAggregate aggregate;
	//当前索引
	private int current=0;
	//创建具体的迭代器，将具体集合传入
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate=aggregate;
	}

	//获取第一个元素
	@Override
	public Object first() {
		return aggregate.getByIndex(0);
	}

	//获取下一个元素
	@Override
	public Object next() {
		Object ret=null;
		current++;
		if(current<aggregate.count()){
			ret=aggregate.getByIndex(current);
		}
		return ret;
	}

	//判断是否是最后一个元素
	@Override
	public boolean isDone() {
		return current>=aggregate.count()?true:false;
	}

	//返回当前元素
	@Override
	public Object currentItem() {
		return aggregate.getByIndex(current);
	}

}
