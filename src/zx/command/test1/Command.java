package zx.command.test1;
/**
 * 声明执行操作的接口
 * @author Carl_Hugo
 *
 */
public abstract class Command {

	protected Receiver receiver;
	public Command(Receiver receiver){
		this.receiver=receiver;
	}
	public abstract void execute();
}
/**
 * 将接收者对象绑定于一个动作，调用接受者相应的动作，以实现execute()
 * @author Carl_Hugo
 */
class ConcreteCommand extends Command{

	public ConcreteCommand(Receiver receiver) {
		super(receiver);
	}
	@Override
	public void execute() {
		receiver.action();
	}
	
}