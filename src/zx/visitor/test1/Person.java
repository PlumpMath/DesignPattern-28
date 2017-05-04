package zx.visitor.test1;

public abstract class Person {

	protected String action;
	
	/**
	 * 得到结论或反应
	 */
	public abstract void getConclusion();

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}

class Man extends Person{

	@Override
	public void getConclusion() {
		if("成功".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"时，背后多半有一个伟大的女人");
		}else if("失败".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"时，闷头喝酒，谁都不用劝");
		}else if("恋爱".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"凡是不懂也要装懂");
		}
	}
	
}

class Woman extends Person{

	@Override
	public void getConclusion() { 
		if("成功".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"时，背后大多有个不成功的男人");
		}else if("失败".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"时，眼泪汪汪，谁也劝不了");
		}else if("恋爱".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"遇事懂也装不懂");
		}
	}
	
}