package zx.flyweightpattern.test1;

public abstract class Flyweight {
	/**
	 * ͨ������ӿ�flyweight���Խ��ܲ��������ⲿ״̬
	 * @param extrinsicstate ����״̬
	 */
	public abstract void operation(int extrinsicstate);

}

class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("�����Flyweight"+extrinsicstate);
	}
}

class UnsharedFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("������ľ����Flyweight"+extrinsicstate);
	}
}