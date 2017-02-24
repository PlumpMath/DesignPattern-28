package zx.flyweightpattern.test2;

public abstract class WebSite {
	/**
	 * 通过这个接口接受外部状态
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
		System.out.println("网站分类："+name);
	}
	
}
