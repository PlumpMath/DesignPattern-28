package zx.bridge.test1;

public class Test {

	public static void main(String[] args) {
		HandSetBrand ab;
		ab=new HandSetBrandN();
		
		ab.setHandSetSoft(new HandSetGame());
		ab.run();
		ab.setHandSetSoft(new HandSetAddressList());
		ab.run();
		
		ab=new HandSetBrandM();
		
		ab.setHandSetSoft(new HandSetGame());
		ab.run();
		ab.setHandSetSoft(new HandSetAddressList());
		ab.run();
		
	}
}
