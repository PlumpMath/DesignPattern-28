package zx.memento.test2;

public class Role {
	
	private int vit;
	private int atk;
	private int def;
	
	//��ó�ʼ״̬
	public void getInitState(){
		this.vit=100;
		this.atk=100;
		this.def=100;
	}
	
	//ս��
	public void fight(){
		this.vit=0;
		this.atk=0;
		this.def=0;
	}
	
	//displayState
	public void stateDisplay(){
		System.out.println("��ɫ��ǰ״̬��");
		System.out.println("������"+this.vit);
		System.out.println("��������"+this.atk);
		System.out.println("��������"+this.def);
	}
	
	//�����ɫ״̬
	public RoleStateMemento saveState(){
		return new RoleStateMemento(vit,atk,def);
	}
	
	//�ָ���ɫ״̬
	public void recoveryState(RoleStateMemento memento){
		this.vit=memento.getVit();
		this.atk=memento.getAtk();
		this.def=memento.getDef();
	}

	public int getVit() {
		return vit;
	}

	public void setVit(int vit) {
		this.vit = vit;
	}

	public int getAtk() {
		return atk;
	}

	public void setAtk(int atk) {
		this.atk = atk;
	}

	public int getDef() {
		return def;
	}

	public void setDef(int def) {
		this.def = def;
	}
	
}
