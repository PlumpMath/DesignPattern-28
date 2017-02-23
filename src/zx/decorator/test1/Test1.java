package zx.decorator.test1;

public class Test1 {
	
	public static void main(String[] args) {
		Person person = new Person("zx");
		System.out.println("第一种装扮");
		Finery tShirts = new TShirts();
		Finery bigTrouser = new BigTrouser();
		tShirts.show();
		bigTrouser.show();
		person.show();
		
	}

}
