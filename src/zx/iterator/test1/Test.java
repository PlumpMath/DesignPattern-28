package zx.iterator.test1;

public class Test {
	
	public static void main(String[] args) {
		//��������ļ�����
		ConcreteAggregate concreteAggregate = new ConcreteAggregate();
		concreteAggregate.setByIndex(0,"����");
		concreteAggregate.setByIndex(1,"С��");
		concreteAggregate.setByIndex(2,"����");
		concreteAggregate.setByIndex(3,"����");
		concreteAggregate.setByIndex(4,"�����ڲ�Ա��");
		concreteAggregate.setByIndex(5,"С͵");

		//ͨ�������ഴ��������
		Iterator i = concreteAggregate.createIterator();
		//�����弯������Ϊ��������������Ĺ��캯����
//		ConcreteIterator i = new ConcreteIterator(concreteAggregate);
		Object first = i.first();
		while(!i.isDone()){
			System.out.println(i.currentItem()+"����Ʊ");
			i.next();
		}
	}
}
