package zx.observerpattern.test1;

public class Test {

	public static void main(String[] args) {
		//ǰ̨
		Secretary secretary = new Secretary();
		//����Ʊ��ͬ��
		StockObserver stockObserver1 = new StockObserver("����",secretary);
		StockObserver stockObserver2 = new StockObserver("����",secretary);
		
		//ǰ̨��¼����λͬ��
		secretary.attach(stockObserver1);
		secretary.attach(stockObserver2);
		
		secretary.setSecretaryAction("Boss�����ˣ�����");
		secretary.inform();
		
	}
	
}
