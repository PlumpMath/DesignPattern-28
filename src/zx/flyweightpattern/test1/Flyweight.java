package zx.flyweightpattern.test1;

public abstract class Flyweight {
	/**
	 * 通过这个接口flyweight可以接受并作用于外部状态
	 * @param extrinsicstate 外在状态
	 */
	public abstract void operation(int extrinsicstate);

}

class ConcreteFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("具体的Flyweight"+extrinsicstate);
	}
}

class UnsharedFlyweight extends Flyweight{

	@Override
	public void operation(int extrinsicstate) {
		System.out.println("不共享的具体的Flyweight"+extrinsicstate);
	}
}