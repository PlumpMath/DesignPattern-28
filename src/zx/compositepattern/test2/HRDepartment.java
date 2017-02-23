package zx.compositepattern.test2;
/**
 * ������Դ������Ҷ�ڵ�
 * @author Carl_Hugo
 */
public class HRDepartment extends Company{

	public HRDepartment(String name) {
		super(name);
	}

	@Override
	public void add(Company c) {
	}

	@Override
	public void remove(Company c) {
	}

	@Override
	public void display(int depth) {
		String str="";
		for(int i=0;i<depth;i++){
			str+='-';
		}
		System.out.println(str+name);
	}

	@Override
	public void lineOfDuty() {
		System.out.println(name+"Ա����Ƹ������ѵ");
	}
}
