package zx.memento.test1;

public class CareTaker {
	
	private Memento memento;

	public Memento getMemento() {
		return memento;
	}

	public void saveMemento(Memento memento) {
		this.memento = memento;
	}
	
}
