package zx.statepattern.test1;

public abstract class State {
	
	public abstract void WriteProgram(Work w);

}

class ForenoonState extends State{

	@Override
	public void WriteProgram(Work w) {
		if(w.getHour()<12){
			System.out.println("��ǰʱ�䣬"+w.getHour()+"�㣬���繤��������ٱ���");
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
			System.out.println("��ǰʱ�䣬"+w.getHour()+"�㣬���ˣ����������ݣ�");
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
			System.out.println("��ǰʱ�䣬"+w.getHour()+"�㣬����״̬����������Ŭ��������");
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
				System.out.println("��ǰʱ�䣬"+w.getHour()+"�㣬�Ӱ�ƣ������...");
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
		System.out.println("��ǰʱ�䣺"+w.getHour()+"�㣬�°�ؼ���Ϣ��");
	}
	
}

class SleepingState extends State{
	@Override
	public void WriteProgram(Work w) {
		System.out.println("��ǰʱ�䣺"+w.getHour()+"�㣬�۾���������˯����");
	}
	
}


