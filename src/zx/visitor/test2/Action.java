package zx.visitor.test2;

public abstract class Action {
	
	//�õ����˽��ۻ�ӳ
	public abstract void getManConclusion(Man concreteElementA);
	//�õ�Ů�˽��ۻ�ӳ
	public abstract void getWomanConclusion(Woman concreteElementB);
}

class Success extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"ʱ����������һ��ΰ���Ů��");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"ʱ����������һ�����ɹ�������");
	}
}

class Failing extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"ʱ����ͷ�Ⱦƣ�˭������Ȱ");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"ʱ������������˭ҲȰ����");
	}
}

class Amativeness extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"���ǲ���ҲҪװ��");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"���¶�Ҳװ����");
	}
	
}

class Marriage extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"�п�����������Ϸ�ս�ʱ��������ͽ�̡�ң����");
		
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"���鳤��·�������������ձ�ƽ��");
	}
	
}