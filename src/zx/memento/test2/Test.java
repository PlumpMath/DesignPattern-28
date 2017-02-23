package zx.memento.test2;

public class Test {
	
	public static void main(String[] args) {
		Role role = new Role();
		
		role.getInitState();
		role.stateDisplay();
		//������Ϸ����
		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
		roleStateCaretaker.setMemento(role.saveState());
		//��սBoss
		role.fight();
		role.stateDisplay();
		//�ָ�֮ǰ��״̬
		role.recoveryState(roleStateCaretaker.getMemento());
		role.stateDisplay();
		
	}

}
