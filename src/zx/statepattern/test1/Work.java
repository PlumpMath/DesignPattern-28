package zx.statepattern.test1;

/**
 * @author Carl_Hugo
 *
 */
public class Work {
	
	//当前状态
	private State current;
	//初始状态为上午工作状态
	public Work(){
		current=new ForenoonState();
	}
	
	//当前时间
	private double hour;
	public double getHour() {
		return hour;
	}
	public void setHour(double hour) {
		this.hour = hour;
	}
	//当前状态任务是否完成
	private boolean finish=false;
	public boolean isFinish() {
		return finish;
	}
	public void setFinish(boolean finish) {
		this.finish = finish;
	}
	//判断当前状态任务是否完成
	public boolean taskFinished(){
		return finish;
	}
	
	//将State的实现类传入，执行不同状态下的writeProgram()方法
	public void setState(State s){
		this.current=s;
	}
	
	public void writeProgram(){
		current.WriteProgram(this);
	}

}
