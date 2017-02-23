package zx.proxy.test1;

public class Proxy implements GiveGift{
	
	Pursuit gg;
	
	public Proxy(SchoolGirl mm){
		gg=new Pursuit(mm);
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		gg.giveDolls();
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		gg.giveFlowers();
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		gg.giveChocolate();
	}
	
	

}
