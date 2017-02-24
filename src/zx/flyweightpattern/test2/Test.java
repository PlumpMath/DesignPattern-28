package zx.flyweightpattern.test2;

public class Test {

	public static void main(String[] args) {
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		WebSite fx = webSiteFactory.getWebSiteCatagory("产品展示");
		fx.use();
		
		WebSite fy = webSiteFactory.getWebSiteCatagory("产品展示");
		fy.use();
		
		WebSite fz = webSiteFactory.getWebSiteCatagory("产品展示");
		fz.use();
		
		WebSite f1 = webSiteFactory.getWebSiteCatagory("博客");
		f1.use();
		
		WebSite f2 = webSiteFactory.getWebSiteCatagory("博客");
		f2.use();
		
		WebSite f3 = webSiteFactory.getWebSiteCatagory("博客");
		f3.use();
		
		System.out.println("网站分类总数："+webSiteFactory.getWebSiteCount());
		
	}
	
}
