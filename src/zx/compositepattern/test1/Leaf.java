package zx.compositepattern.test1;
/**
 * ������б�ʾҶ�ӽڵ�
 * @author Carl_Hugo
 */
public class Leaf extends Component{

	public Leaf(String name) {
		super(name);
	}

	/**
	 * Ҷ�ӽڵ�û���ӽڵ�
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
