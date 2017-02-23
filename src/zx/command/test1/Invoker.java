package zx.command.test1;
/**
 * 要求该命令执行该请求
 * @author Carl_Hugo
 */
public class Invoker {
	
	private Command command;
	
	public void setCommand(Command command){
		this.command=command;
	}
	
	public void executeCommand(){
		command.execute();
	}
}
