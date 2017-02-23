package zx.iterator.test1;

public abstract class Iterator {
	
	//得到开始对象
	public abstract Object first();
	//得到下一个对象
	public abstract Object next();
	//判断是否到结尾
	public abstract boolean isDone();
	//返回当前对象
	public abstract Object currentItem();

}
