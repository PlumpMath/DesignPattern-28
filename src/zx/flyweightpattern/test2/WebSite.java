package zx.flyweightpattern.test2;

public abstract class WebSite {
	/**
	 * ͨ������ӿڽ����ⲿ״̬
	 */
	public abstract void use();
}

class ConcreteWebSite extends WebSite{

	String name="";
	
	public ConcreteWebSite(String name) {
		this.name=name;
	}
	@Override
	public void use() {
		System.out.println("��վ���ࣺ"+name);
	}
	
}
