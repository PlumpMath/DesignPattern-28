package zx.command.test2;

/**
 * ����ִ�������ߵ���
 * @author Carl_Hugo
 */
public class Waiter {
	
	private Command command;
	
	//���ö���
	public void setOrder(Command command){
		this.command=command;
	}
	
	//ִ֪ͨ��
	public void notifyBarbecuer(){
		command.executeCommand();
	}
}
