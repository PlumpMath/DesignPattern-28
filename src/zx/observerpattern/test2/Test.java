package zx.observerpattern.test2;

public class Test {

	public static void main(String[] args) {
		Subject boss = new Boss();
		
		Observer observer1 = new NBAObserver("张三",boss);
		Observer observer2 = new StockObserver("李四",boss);
		
		boss.attach(observer1);
		boss.attach(observer2);
		
		boss.setSubjectState("我胡汉三回来了！");
		boss.inform();
		
	}
}
