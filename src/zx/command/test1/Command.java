package zx.command.test1;
/**
 * ����ִ�в����Ľӿ�
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
 * �������߶������һ�����������ý�������Ӧ�Ķ�������ʵ��execute()
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