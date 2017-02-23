package zx.bridge.test1;
/**
 * 手机软件
 * @author Carl_Hugo
 */
public abstract class HandSetSoft {
	
	public abstract void run();

}

class HandSetGame extends HandSetSoft{
	@Override
	public void run() {
		System.out.println("运行手机游戏");
	}
}

class HandSetAddressList extends HandSetSoft{
	@Override
	public void run() {
		System.out.println("运行手机通讯录");
	}
}