package zx.mediator.test2;

public abstract class UnitedNations {
	
	//·¢±íÉùÃ÷
	public abstract void declared(String message,Country colleague);

}

class UnitedNationsSecurityCouncil extends UnitedNations{

	private USA colleague1;
	private Irap colleague2;
	
	@Override
	public void declared(String message, Country colleague) {
		if(colleague instanceof USA){
			colleague2.getMessage(message);
		}else{
			colleague1.getMessage(message);
		}
	}

	public void setColleague1(USA colleague1) {
		this.colleague1 = colleague1;
	}

	public void setColleague2(Irap colleague2) {
		this.colleague2 = colleague2;
	}
	
	
	
}
