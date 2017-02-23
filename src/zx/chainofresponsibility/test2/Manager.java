package zx.chainofresponsibility.test2;

public abstract class Manager {
	
	protected String name;
	//上级
	protected Manager superier;
	
	public Manager(String name){
		this.name=name;
	}
	
	//设置管理者的上级
	public void setSuperior(Manager superier){
		this.superier=superier;
	}
	
	//申请请求
	public abstract void requestApplications(Request request);

}

class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if("请假".equals(request.getRequestType())&&request.getNumber()<=2){
			System.out.println(name+":"+request.getRequestType()+"" +
					" 数量"+request.getNumber()+" 被批准");
		}else if(superier!=null){
			superier.requestApplications(request);
		}
	}
}

class Majordomo extends Manager{

	public Majordomo(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if("请假".equals(request.getRequestType())&&request.getNumber()<=5){
			System.out.println(name+":"+request.getRequestType()+"" +
					" 数量"+request.getNumber()+" 被批准");
		}else if(superier!=null){
			superier.requestApplications(request);
		}
	}
}

class GeneralManager extends Manager{

	public GeneralManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if("请假".equals(request.getRequestType())){
			System.out.println(name+":"+request.getRequestType()+"" +
					" 数量"+request.getNumber()+" 被批准");
		}else if("加薪".equals(request.getRequestType())&&request.getNumber()<=500){
			System.out.println(name+":"+request.getRequestType()+"" +
					" 数量"+request.getNumber()+" 被批准");
		}else if("加薪".equals(request.getRequestType())&&request.getNumber()>500){
			System.out.println(name+":"+request.getRequestType()+"" +
					" 数量"+request.getNumber()+" 再说吧！");
		}
	}
}