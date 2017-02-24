package zx.flyweightpattern.test3;

public abstract class WebSite {
	
	/**
	 * ʹ�õķ�����Ҫ����User����
	 * @param user
	 */
	public abstract void use(User user);

}

class ConcreteWebSite extends WebSite{

	private String name="";
	public ConcreteWebSite(String name){
		this.name=name;
	}
	@Override
	public void use(User user) {
		System.out.println("��վ���ࣺ"+name+" �û���"+user.getName());
	}
	
}
