package zx.templatepattern.test1;

public abstract class AbstractClass {
	
	//һЩ������Ϊ�ŵ�������ȥʵ��
	public abstract void primitiveOperation1();
	public abstract void primitiveOperation2();
	
	//ģ�淽���������߼��ĹǼܣ��߼��������һЩ��Ӧ�ĳ�����������Ƕ��Ƴٵ�������ȥʵ��
	public void TemplateMethod(){
		primitiveOperation1();
		primitiveOperation2();
	}

}
