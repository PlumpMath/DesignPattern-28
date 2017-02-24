package zx.flyweightpattern.test1;

public class Test {
	
	public static void main(String[] args) {
		int extrinsicstate=22;
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		
		Flyweight fx=flyweightFactory.getFlyweight("X");
		fx.operation(--extrinsicstate);
		
		Flyweight fy=flyweightFactory.getFlyweight("Y");
		fy.operation(--extrinsicstate);
		
		Flyweight fz=flyweightFactory.getFlyweight("Z");
		fz.operation(--extrinsicstate);
		
		UnsharedFlyweight unsharedFlyweight = new UnsharedFlyweight();
		unsharedFlyweight.operation(--extrinsicstate);
		
	}

}
