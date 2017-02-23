package zx.adapterpattern.test1;

public class Target {
	//客户端所期待的接口
	public void request(){
		System.out.println("普通请求！");
	}
}

class Adaptee {
	public void specificRequest() {
		System.out.println("特殊请求！");
	}
}

class Adapter extends Target{
	
	private Adaptee adaptee=new Adaptee();

	@Override
	public void request() {
		adaptee.specificRequest();
	}
}
