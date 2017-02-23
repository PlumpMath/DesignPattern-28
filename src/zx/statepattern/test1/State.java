package zx.statepattern.test1;

public abstract class State {
	
	public abstract void WriteProgram(Work w);

}

class ForenoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour()<12){
			System.out.println("当前时间，"+w.getHour()+"点，上午工作，精神百倍！");
		}else{
			w.setState(new NoonState());
			w.writeProgram();
		}
	}
}

class NoonState extends State{
	@Override
	public void WriteProgram(Work w) {
		if(w.getHour()<13){
			System.out.println("当前时间，"+w.getHour()+"点，饿了，犯困，午休！");
		}else{
			w.setState(new AfternoonState());
			w.writeProgram();
		}
	}
}

class AfternoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour()<17){
			System.out.println("当前时间，"+w.getHour()+"点，下午状态还不错，继续努力工作！");
		}else{
			w.setState(new EveningState());
			w.writeProgram();
		}
	}
}

class EveningState extends State{
	@Override
	public void WriteProgram(Work w) {
		if(w.taskFinished()){
			w.setState(new RestState());
			w.writeProgram();
		}else{
			if(w.getHour()<21){
				System.out.println("当前时间，"+w.getHour()+"点，加班疲劳至极...");
			}else{
				w.setState(new SleepingState());
				w.writeProgram();
			}
		}
	}
}

class RestState extends State{
	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"点，下班回家休息了");
	}
	
}

class SleepingState extends State{
	@Override
	public void WriteProgram(Work w) {
		System.out.println("当前时间："+w.getHour()+"点，眼睛睁不开，睡着了");
	}
	
}


