package zx.singleton.test1;

public class Test {
	
	public static void main(String[] args) {
		Singleton instance1 = Singleton.getInstance();
		Singleton instance2 = Singleton.getInstance();
		
//		Singleton2 instance1 = Singleton2.getInstance();
//		Singleton2 instance2 = Singleton2.getInstance();
		if(instance1==instance2){
			System.out.println("两个是相同的实例");
		}
		
	}

}
