package zx.chainofresponsibility.test2;

public class Test {
	
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("经理");
		Majordomo manjordomo = new Majordomo("总监");
		GeneralManager generalManager = new GeneralManager("总经理");
		
		commonManager.setSuperior(manjordomo);
		manjordomo.setSuperior(generalManager);
		
		Request request = new Request();
		request.setRequestType("请假");
		request.setRequestContent("小菜请假");
		request.setNumber(1);
		commonManager.requestApplications(request);
		
		Request request2 = new Request();
		request2.setRequestType("请假");
		request2.setRequestContent("小明请假");
		request2.setNumber(4);
		commonManager.requestApplications(request2);
		
		Request request3 = new Request();
		request3.setRequestType("加薪");
		request3.setRequestContent("小菜请求加薪");
		request3.setNumber(500);
		commonManager.requestApplications(request3);
		
		Request request4 = new Request();
		request4.setRequestType("加薪");
		request4.setRequestContent("小菜请求加薪");
		request4.setNumber(1000);
		commonManager.requestApplications(request4);
		
		
	}

}
