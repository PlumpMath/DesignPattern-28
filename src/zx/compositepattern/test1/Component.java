package zx.compositepattern.test1;
/**
 * @author Carl_Hugo
 * ����һ���ӿ����ڷ��ʺ͹���Component�Ӳ���
 */
public abstract class Component {

	protected String name;
	public Component(String name){
		this.name=name;
	}
	//��������ɾ���Ӳ���
	public abstract void add(Component component);
	public abstract void remove(Component component);
	public abstract void display(int depth);

}
