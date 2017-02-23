package zx.command.test2;

public class Test {
	
	public static void main(String[] args) {
		Barbecuer barbecuer = new Barbecuer();
		
		Command bakeMuttonCommand1 = new BakeMuttonCommand(barbecuer);
		Command bakeMuttonCommand2 = new BakeMuttonCommand(barbecuer);
		Command bakeChildrenWingCommand = new BakeChildrenWingCommand(barbecuer);
		
		Waiter waiter = new Waiter();
		waiter.setOrder(bakeMuttonCommand1);
		waiter.notifyBarbecuer();
		waiter.setOrder(bakeMuttonCommand2);
		waiter.notifyBarbecuer();
		waiter.setOrder(bakeChildrenWingCommand);
		waiter.notifyBarbecuer();
		
		
	}

}
