package zx.prototype.test2;

public class Test {

	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("����");
		resume.setPersonalInfo("��", "24");
		resume.setWorkExperience("2011-2014", "YY��˾");
		
		Resume b = (Resume)resume.clone();
		b.setWorkExperience("2013-2015", "KK��˾");
		
		resume.display();
		b.display();
	}
}
