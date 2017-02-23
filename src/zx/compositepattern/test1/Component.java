package zx.compositepattern.test1;
/**
 * @author Carl_Hugo
 * 声明一个接口用于访问和管理Component子部件
 */
public abstract class Component {

	protected String name;
	public Component(String name){
		this.name=name;
	}
	//用于增加删除子部件
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void display(int depth);

}
