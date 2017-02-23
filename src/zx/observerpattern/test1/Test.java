package zx.observerpattern.test1;

public class Test {

	public static void main(String[] args) {
		//前台
		Secretary secretary = new Secretary();
		//看股票的同事
		StockObserver stockObserver1 = new StockObserver("张三",secretary);
		StockObserver stockObserver2 = new StockObserver("李四",secretary);
		
		//前台记录下两位同事
		secretary.attach(stockObserver1);
		secretary.attach(stockObserver2);
		
		secretary.setSecretaryAction("Boss回来了！！！");
		secretary.inform();
		
	}
	
}
