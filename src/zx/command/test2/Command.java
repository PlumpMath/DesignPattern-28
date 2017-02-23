package zx.command.test2;
/**
 * ִ���������
 * @author Carl_Hugo
 */
public abstract class Command {

	protected Barbecuer receiver;
	//���������࣬ȷ�����⴮����˭
	public Command(Barbecuer receiver){
		this.receiver=receiver;
	}
	//ִ������
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
