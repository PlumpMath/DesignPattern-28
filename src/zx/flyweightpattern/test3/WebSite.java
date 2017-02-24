package zx.flyweightpattern.test3;

public abstract class WebSite {
	
	/**
	 * 使用的方法需要传递User对象
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
		System.out.println("网站分类："+name+" 用户："+user.getName());
	}
	
}
