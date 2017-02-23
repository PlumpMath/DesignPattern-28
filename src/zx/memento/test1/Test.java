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
		//������¼��Ϣ�ָ�
		o.setMemento(c.getMemento());
		o.show();
	}

}
