package zx.memento.test2;

public class Test {
	
	public static void main(String[] args) {
		Role role = new Role();
		
		role.getInitState();
		role.stateDisplay();
		//保存游戏进度
		RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
		roleStateCaretaker.setMemento(role.saveState());
		//大战Boss
		role.fight();
		role.stateDisplay();
		//恢复之前的状态
		role.recoveryState(roleStateCaretaker.getMemento());
		role.stateDisplay();
		
	}

}
