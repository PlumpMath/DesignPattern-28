package zx.proxy.test1;

public class Pursuit implements GiveGift{
	
	public SchoolGirl mm;
	
	public Pursuit(SchoolGirl mm){
		this.mm=mm;
	}

	@Override
	public void giveDolls() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"����������");
	}

	@Override
	public void giveFlowers() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"�����ʻ�");
	}

	@Override
	public void giveChocolate() {
		// TODO Auto-generated method stub
		System.out.println(mm.getName()+"�����ɿ���");
	}

}
