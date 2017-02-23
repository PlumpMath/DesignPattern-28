package zx.factorymethod.test2;

public class SimpleFactory {
	
	private static LeiFeng s1;

	public static LeiFeng createLeiFeng(String type){
		LeiFeng result=null;
		switch(type){
			case "ѧ�׷�Ĵ�ѧ��":result=new UnderGraduate();break;
			case "����־Ը��":result=new UnderGraduate();break;
		}
		return result;
	}
	
	public static void main(String[] args) {
		LeiFeng s1 = SimpleFactory.createLeiFeng("����־Ը��");
		LeiFeng s2 = SimpleFactory.createLeiFeng("����־Ը��");
		s1.BuyRice();
		s2.Sweep();
	}

}
