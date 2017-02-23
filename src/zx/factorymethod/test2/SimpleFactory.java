package zx.factorymethod.test2;

public class SimpleFactory {
	
	private static LeiFeng s1;

	public static LeiFeng createLeiFeng(String type){
		LeiFeng result=null;
		switch(type){
			case "学雷锋的大学生":result=new UnderGraduate();break;
			case "社区志愿者":result=new UnderGraduate();break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LeiFeng s1 = SimpleFactory.createLeiFeng("社区志愿者");
		LeiFeng s2 = SimpleFactory.createLeiFeng("社区志愿者");
		s1.BuyRice();
		s2.Sweep();
	}

}
