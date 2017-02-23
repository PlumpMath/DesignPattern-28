package zx.observerpattern.test2;

public class Test {

	public static void main(String[] args) {
		Subject boss = new Boss();
		
		Observer observer1 = new NBAObserver("����",boss);
		Observer observer2 = new StockObserver("����",boss);
		
		boss.attach(observer1);
		boss.attach(observer2);
		
		boss.setSubjectState("�Һ����������ˣ�");
		boss.inform();
		
	}
}
