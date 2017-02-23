package zx.prototype.test1;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("张三");
		resume.setPersonalInfo("男", "24");
		resume.setWorkExperience("2005-2009", "XX公司");
		
		Resume b=(Resume)resume.clone();
		b.setWorkExperience("2009-2010", "YY公司");
		
		resume.display();
		b.display();
		
		
	}

}
