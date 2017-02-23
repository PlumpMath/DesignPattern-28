package zx.compositepattern.test1;
/**
 * 在组合中表示叶子节点
 * @author Carl_Hugo
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	/**
	 * 叶子节点没有子节点
	 */
	@Override
	public void add(Component component) {
		System.out.println("Can not add to a leaf!");
	}

	@Override
	public void remove(Component component) {
		System.out.println("Can not remove from a leaf");
	}

	@Override
	public void display(int depth) {
		String str="";
		for(int i=0;i<depth;i++){
			str+='-';
		}
		System.out.println(str+name);
	}

}
