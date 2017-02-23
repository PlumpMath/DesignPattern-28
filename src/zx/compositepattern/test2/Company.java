package zx.compositepattern.test2;
/**
 * 公司类，抽象接口
 * @author Carl_Hugo
 *
 */
public abstract class Company {
	
	protected String name;
	public Company(String name){
		this.name=name;
	}
	
	public abstract void add(Company c);
	public abstract void remove(Company c);
	public abstract void display(int depth);
	//履行职责
	public abstract void lineOfDuty();

}
