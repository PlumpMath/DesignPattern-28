package zx.chainofresponsibility.test1;
/**
 * 处理器类 
 * @author Carl_Hugo
 */
public abstract class Handler {
	
	protected Handler successor;
	//设置继任者
	public void setSuccessor(Handler successor){
		this.successor=successor;
	}
	//处理请求
	public abstract void HandlerRequest(int request);
}

class ConcreteHandler1 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if(request>=0&&request<10){
			System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
		}else if(successor!=null){
			successor.HandlerRequest(request);
		}
	}
}

class ConcreteHandler2 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if(request>=10&&request<20){
			System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
		}else if(successor!=null){
			successor.HandlerRequest(request);
		}
	}
}

class ConcreteHandler3 extends Handler{

	@Override
	public void HandlerRequest(int request) {
		if(request>=20&&request<30){
			System.out.println(this.getClass().getSimpleName()+"处理请求"+request);
		}else if(successor!=null){
			successor.HandlerRequest(request);
		}
	}
}