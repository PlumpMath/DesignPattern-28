package zx.command.test1;
/**
 * Ҫ�������ִ�и�����
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
