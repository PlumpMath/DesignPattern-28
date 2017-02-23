package zx.command.test1;

public class Test {

	public static void main(String[] args) {
		//创建命令的接收者
		Receiver receiver = new Receiver();
		//创建具体的执行命令
		ConcreteCommand concreteCommand = new ConcreteCommand(receiver);
		//创建命令传递者
		Invoker invoker = new Invoker();
		//将执行命令设置给命令传递者
		invoker.setCommand(concreteCommand);
		//执行命令
		invoker.executeCommand();
	}
}
