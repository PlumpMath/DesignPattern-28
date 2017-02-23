package zx.compositepattern.test2;
/**
 * ���񲿣���Ҷ�ڵ�
 * @author Carl_Hugo
 */ 
public class FinanceDepartment extends Company{

	public FinanceDepartment(String name) {
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
		System.out.println(name+"��˾������֧����");
	}
}
