package zx.decorator.test2;

public class Test {
	
	public static void main(String[] args) {
		Person person = new Person("zx");
		System.out.println("第一种装扮");
		Sneakers sneakers = new Sneakers();
		BigTrouser bigTrouser = new BigTrouser();
		TShirts tShirts = new TShirts();

		sneakers.Decorator(person);
		bigTrouser.Decorator(sneakers);
		tShirts.Decorator(bigTrouser);
		tShirts.show();
		
	}

}
