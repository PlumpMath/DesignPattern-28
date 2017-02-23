package zx.factorymethod.test2;

public class Test {

	public static void main(String[] args) {
		IFactory underGraduateFactory = new UnderGraduateFactory();
		LeiFeng leiFeng = underGraduateFactory.createLeiFeng();
		leiFeng.Sweep();
		leiFeng.BuyRice();
		leiFeng.Wash();
	}
}
