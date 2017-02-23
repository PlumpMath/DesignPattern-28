package zx.singleton.test1;

public class Singleton {
	
	private static Singleton instance;
	//私有化构造函数
	private Singleton(){}
	//创建公共的静态方法获取单个实例
	/**
	 * 当instance为null时,并且同时有两个线程调用getInstance()方法时,
	 * 他们都想进入第一重instance==null的判断。由于锁机制，这两个线程只有一个进入，
	 * 另一个在外面排队。当第一个创建了实例后，如果没有第二个instance==null的判断，
	 * 则的二个线程会进入继续创建实例，就不能达到单例的目的。
	 * @return
	 */
	public static Singleton getInstance(){
		if(instance==null){
			synchronized ("lock") {
				if(instance==null){
					instance=new Singleton();
				}
			}
		}
		return instance;
	}

}
