package zx.command.test2;

/**
 * 呼叫执行命令者的类
 * @author Carl_Hugo
 */
public class Waiter {
	
	private Command command;
	
	//设置订单
	public void setOrder(Command command){
		this.command=command;
	}
	
	//通知执行
	public void notifyBarbecuer(){
		command.executeCommand();
	}
}
