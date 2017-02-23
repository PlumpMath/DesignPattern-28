package zx.observerpattern.test2;

public abstract class Subject {
	
	abstract void attach(Observer observer);
	abstract void detach(Observer observer);
	
	abstract void inform();
	
	protected String subjectState;
	
	public String getSubjectState() {
		return subjectState;
	}
	public void setSubjectState(String subjectState) {
		this.subjectState = subjectState;
	}
	
	
}
