package zx.prototype.test1;

public class Test {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		Resume resume = new Resume("����");
		resume.setPersonalInfo("��", "24");
		resume.setWorkExperience("2005-2009", "XX��˾");
		
		Resume b=(Resume)resume.clone();
		b.setWorkExperience("2009-2010", "YY��˾");
		
		resume.display();
		b.display();
		
		
	}

}
