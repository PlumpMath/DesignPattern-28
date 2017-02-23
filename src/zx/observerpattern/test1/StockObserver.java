package zx.observerpattern.test1;

public class StockObserver {

	private String name;
	private Secretary sub;
	
	public StockObserver(String name,Secretary sub){
		this.name=name;
		this.sub=sub;
	}
	
	public void update() {
		System.out.println(sub.SecretaryAction+" "+name+" �رչ�Ʊ���飬����Ŭ������");
	}

}
