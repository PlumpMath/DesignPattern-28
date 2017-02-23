package zx.command.test2;
/**
 * 执行命令的类
 * @author Carl_Hugo
 */
public abstract class Command {

	protected Barbecuer receiver;
	//抽象命令类，确定烤肉串者是谁
	public Command(Barbecuer receiver){
		this.receiver=receiver;
	}
	//执行命令
	public abstract void executeCommand(); 

}

class BakeMuttonCommand extends Command{

	public BakeMuttonCommand(Barbecuer receiver) {
		super(receiver);
	}
	
	@Override
	public void executeCommand() {
		receiver.bakeMutton();
	}
}

class BakeChildrenWingCommand extends Command{

	public BakeChildrenWingCommand(Barbecuer receiver) {
		super(receiver);
	}
	@Override
	public void executeCommand() {
		receiver.bakeChickenWing();
	}
}
