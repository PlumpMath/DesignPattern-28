package zx.visitor.test2;

public class Test {

	public static void main(String[] args) {
		ObjectStructure o = new ObjectStructure();
		o.attach(new Man());
		o.attach(new Woman());
		
		//成功时的反应
		Success v1 = new Success();
		o.display(v1);
		//失败时的反应
		Failing f1 = new Failing();
		o.display(f1);
		//恋爱时的反应
		Amativeness a1 = new Amativeness();
		o.display(a1);
		//
		Marriage m4 = new Marriage();
		o.display(m4);
	}
}
