package zx.flyweightpattern.test3;

public class Test {
	
	public static void main(String[] args) {
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		WebSite f1 = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		f1.use(new User("С��"));
		
		WebSite f2 = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		f2.use(new User("С��"));
		
		WebSite f3 = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		f3.use(new User("С��"));
		
		WebSite f4 = webSiteFactory.getWebSiteCatagory("����");
		f4.use(new User("С��"));
		
		WebSite f5 = webSiteFactory.getWebSiteCatagory("����");
		f5.use(new User("Сǿ"));
		
		WebSite f6 = webSiteFactory.getWebSiteCatagory("����");
		f6.use(new User("С��"));
		
		System.out.println("�õ���վ����������"+webSiteFactory.getWebSiteCount());
	}

}
