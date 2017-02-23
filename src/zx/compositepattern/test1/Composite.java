package zx.compositepattern.test1;

import java.util.ArrayList;
import java.util.List;
/**
 * Composite������֦�ڵ���Ϊ�����ڴ洢�Ӳ�������Ҷ�ӽڵ㲻ͬ��
 * @author Carl_Hugo
 *
 */
public class Composite extends Component{
	
	private List<Component> children=new ArrayList<Component>();

	public Composite(String name) {
		super(name);
	}

	@Override
	public void add(Component component) {
		children.add(component);
	}

	@Override
	public void remove(Component component) {
		children.remove(component);
	}

	@Override
	public void display(int depth) {
		String str="";
		for(int i=0;i<depth;i++){
			str+='-';
		}
		System.out.println(str+name);
		
		for(Component c:children){
			c.display(depth+2);
		}
		
	}

}
