package zx.bridge.test1;

public abstract class HandSetBrand {
	
	protected HandSetSoft soft;
	//设置手机软件
	public void setHandSetSoft(HandSetSoft soft){
		this.soft=soft;
	}
    //运行
	public abstract void run();
}

class HandSetBrandN extends HandSetBrand{
	@Override
	public void run() {
		System.out.print("品牌N:");
		soft.run();
	}
}

class HandSetBrandM extends HandSetBrand{
	@Override
	public void run() {
		System.out.print("品牌M:");
		soft.run();
	}
}
