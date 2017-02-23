package zx.iterator.test1;

public class ConcreteIterator extends Iterator{

	//���弯����
	private ConcreteAggregate aggregate;
	//��ǰ����
	private int current=0;
	//��������ĵ������������弯�ϴ���
	public ConcreteIterator(ConcreteAggregate aggregate){
		this.aggregate=aggregate;
	}

	//��ȡ��һ��Ԫ��
	@Override
	public Object first() {
		return aggregate.getByIndex(0);
	}

	//��ȡ��һ��Ԫ��
	@Override
	public Object next() {
		Object ret=null;
		current++;
		if(current<aggregate.count()){
			ret=aggregate.getByIndex(current);
		}
		return ret;
	}

	//�ж��Ƿ������һ��Ԫ��
	@Override
	public boolean isDone() {
		return current>=aggregate.count()?true:false;
	}

	//���ص�ǰԪ��
	@Override
	public Object currentItem() {
		return aggregate.getByIndex(current);
	}

}
