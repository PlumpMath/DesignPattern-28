package zx.memento.test1;

public class Test {
	
	public static void main(String[] args) {
		Originator o = new Originator();
		o.setState("ON");
		o.show();
		
		CareTaker c = new CareTaker();
		Memento memento = o.createMemento();
		c.saveMemento(memento);
		
		o.setState("OFF");
		o.show();
		//将备忘录信息恢复
		o.setMemento(c.getMemento());
		o.show();
	}

}
