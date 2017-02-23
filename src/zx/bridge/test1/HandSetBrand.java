package zx.bridge.test1;

public abstract class HandSetBrand {
	
	protected HandSetSoft soft;
	//�����ֻ����
	public void setHandSetSoft(HandSetSoft soft){
		this.soft=soft;
	}
    //����
	public abstract void run();
}

class HandSetBrandN extends HandSetBrand{
	@Override
	public void run() {
		System.out.print("Ʒ��N:");
		soft.run();
	}
}

class HandSetBrandM extends HandSetBrand{
	@Override
	public void run() {
		System.out.print("Ʒ��M:");
		soft.run();
	}
}
