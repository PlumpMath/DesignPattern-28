package zx.chainofresponsibility.test2;

public class Test {
	
	public static void main(String[] args) {
		CommonManager commonManager = new CommonManager("����");
		Majordomo manjordomo = new Majordomo("�ܼ�");
		GeneralManager generalManager = new GeneralManager("�ܾ���");
		
		commonManager.setSuperior(manjordomo);
		manjordomo.setSuperior(generalManager);
		
		Request request = new Request();
		request.setRequestType("���");
		request.setRequestContent("С�����");
		request.setNumber(1);
		commonManager.requestApplications(request);
		
		Request request2 = new Request();
		request2.setRequestType("���");
		request2.setRequestContent("С�����");
		request2.setNumber(4);
		commonManager.requestApplications(request2);
		
		Request request3 = new Request();
		request3.setRequestType("��н");
		request3.setRequestContent("С�������н");
		request3.setNumber(500);
		commonManager.requestApplications(request3);
		
		Request request4 = new Request();
		request4.setRequestType("��н");
		request4.setRequestContent("С�������н");
		request4.setNumber(1000);
		commonManager.requestApplications(request4);
		
		
	}

}
