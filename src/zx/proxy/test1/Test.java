package zx.proxy.test1;

public class Test {
	
	public static void main(String[] args) {
		SchoolGirl schoolGirl = new SchoolGirl();
		schoolGirl.setName("haha");
		
		Proxy proxy = new Proxy(schoolGirl);
		proxy.giveChocolate();
		proxy.giveDolls();
		proxy.giveFlowers();
		
	}

}
