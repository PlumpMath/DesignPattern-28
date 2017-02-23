package zx.iterator.test1;

import java.util.ArrayList;
import java.util.List;

public class ConcreteAggregate extends Aggregate{

	//����list����
	private List<Object> items=new ArrayList<Object>();
	
	//�����ü��ϵĵ�����
	@Override
	public Iterator createIterator() {
		return new ConcreteIterator(this);
	}
	
	//���ؼ����ж��������
	public int count(){
		return items.size(); 
	}
	
	//��ȡ�����ü����е�Ԫ��
	public Object getByIndex(int index){
		return items.get(index);
	}
	public void setByIndex(int index,Object value){
		items.add(index, value);
	}

}
