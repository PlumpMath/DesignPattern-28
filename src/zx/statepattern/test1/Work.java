package zx.statepattern.test1;

/**
 * @author Carl_Hugo
 *
 */
public class Work {
	
	//��ǰ״̬
	private State current;
	//��ʼ״̬Ϊ���繤��״̬
	public Work(){
		current=new ForenoonState();
	}
	
	//��ǰʱ��
	private double hour;
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	//��ǰ״̬�����Ƿ����
	private boolean finish=false;
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	//�жϵ�ǰ״̬�����Ƿ����
	public boolean taskFinished(){
		return finish;
	}
	
	//��State��ʵ���ഫ�룬ִ�в�ͬ״̬�µ�writeProgram()����
	public void setState(State s){
		this.current=s;
	}
	
	public void writeProgram(){
		current.WriteProgram(this);
	}

}
