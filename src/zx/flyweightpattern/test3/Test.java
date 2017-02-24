package zx.flyweightpattern.test3;

public class Test {
	
	public static void main(String[] args) {
		WebSiteFactory webSiteFactory = new WebSiteFactory();
		
		WebSite f1 = webSiteFactory.getWebSiteCatagory("产品展示");
		f1.use(new User("小明"));
		
		WebSite f2 = webSiteFactory.getWebSiteCatagory("产品展示");
		f2.use(new User("小王"));
		
		WebSite f3 = webSiteFactory.getWebSiteCatagory("产品展示");
		f3.use(new User("小方"));
		
		WebSite f4 = webSiteFactory.getWebSiteCatagory("博客");
		f4.use(new User("小明"));
		
		WebSite f5 = webSiteFactory.getWebSiteCatagory("博客");
		f5.use(new User("小强"));
		
		WebSite f6 = webSiteFactory.getWebSiteCatagory("购物");
		f6.use(new User("小东"));
		
		System.out.println("得到网站分类总数："+webSiteFactory.getWebSiteCount());
	}

}
