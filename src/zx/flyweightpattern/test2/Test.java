package zx.flyweightpattern.test2;

public class Test {

	public static void main(String[] args) {
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		WebSite fx = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		fx.use();
		
		WebSite fy = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		fy.use();
		
		WebSite fz = webSiteFactory.getWebSiteCatagory("��Ʒչʾ");
		fz.use();
		
		WebSite f1 = webSiteFactory.getWebSiteCatagory("����");
		f1.use();
		
		WebSite f2 = webSiteFactory.getWebSiteCatagory("����");
		f2.use();
		
		WebSite f3 = webSiteFactory.getWebSiteCatagory("����");
		f3.use();
		
		System.out.println("��վ����������"+webSiteFactory.getWebSiteCount());
		
	}
	
}
