package zx.prototype.test2;

public class Resume implements Cloneable{
	
	private String name;
	private String age;
	private String sex;
	private WorkExperience workExperience;
	
	public Resume(String name){
		this.name=name;
		workExperience=new WorkExperience();
	}
	
	private Resume(WorkExperience workExperience) throws CloneNotSupportedException{
		this.workExperience=(WorkExperience)workExperience.clone();
	}
	
	public void setPersonalInfo(String sex,String age){
		this.sex=sex;
		this.age=age;
	}
	
	public void setWorkExperience(String workDate,String company){
		workExperience.setWorkDate(workDate);
		workExperience.setCompany(company);
	}
	
	public void display(){
		System.out.println("name:"+name+" sex:"+sex+" age:"+age);
		System.out.println("工作经历："+workExperience.getWorkDate()+" "+workExperience.getCompany());
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		Resume resume = new Resume(this.workExperience);
		resume.name=this.name;
		resume.sex=this.sex;
		resume.age=this.age;
		return resume;
	}

}
