package zx.iterator.test1;

public abstract class Iterator {
	
	//�õ���ʼ����
	public abstract Object first();
	//�õ���һ������
	public abstract Object next();
	//�ж��Ƿ񵽽�β
	public abstract boolean isDone();
	//���ص�ǰ����
	public abstract Object currentItem();

}
