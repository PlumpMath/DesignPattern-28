package zx.visitor.test1;

public abstract class Person {

	protected String action;
	
	/**
	 * �õ����ۻ�Ӧ
	 */
	public abstract void getConclusion();

	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
}

class Man extends Person{

	@Override
	public void getConclusion() {
		if("�ɹ�".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"ʱ����������һ��ΰ���Ů��");
		}else if("ʧ��".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"ʱ����ͷ�Ⱦƣ�˭������Ȱ");
		}else if("����".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"���ǲ���ҲҪװ��");
		}
	}
	
}

class Woman extends Person{

	@Override
	public void getConclusion() { 
		if("�ɹ�".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"ʱ���������и����ɹ�������");
		}else if("ʧ��".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"ʱ������������˭ҲȰ����");
		}else if("����".equals(action)){
			System.out.println(this.getClass().getSimpleName()+action+"���¶�Ҳװ����");
		}
	}
	
}