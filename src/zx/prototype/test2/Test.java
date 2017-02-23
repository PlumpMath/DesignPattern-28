package zx.prototype.test2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("张三");
		resume.setPersonalInfo("男", "24");
		resume.setWorkExperience("2011-2014", "YY公司");
		
		Resume b = (Resume)resume.clone();
		b.setWorkExperience("2013-2015", "KK公司");
		
		resume.display();
		b.display();
	}
}
