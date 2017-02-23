package zx.singleton.test1;
/**
 * 饿汉单例模式 
 * @author Carl_Hugo
 */
//组织该类被继承，防止产生新的实例
public final class Singleton2 {
	//第一次引用类的任何成员时创建实例，在类被加载时创建实例
	private static final Singleton2 singleton2=new Singleton2();
	//私有化构造函数
	private Singleton2(){}
	//创建公共的静态方法获取实例
	public static Singleton2 getInstance(){
		return singleton2;
	}

}
