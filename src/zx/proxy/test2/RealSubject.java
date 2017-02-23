package zx.proxy.test2;

public class RealSubject implements Subject{

	@Override
	public void Request() {
		// TODO Auto-generated method stub
		System.out.println("真实的请求");
	}


}
