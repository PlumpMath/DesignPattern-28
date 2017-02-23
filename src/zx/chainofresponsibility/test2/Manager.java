package zx.chainofresponsibility.test2;

public abstract class Manager {
	
	protected String name;
	//�ϼ�
	protected Manager superier;
	
	public Manager(String name){
		this.name=name;
	}
	
	//���ù����ߵ��ϼ�
	public void setSuperior(Manager superier){
		this.superier=superier;
	}
	
	//��������
	public abstract void requestApplications(Request request);

}

class CommonManager extends Manager{

	public CommonManager(String name) {
		super(name);
	}

	@Override
	public void requestApplications(Request request) {
		if("���".equals(request.getRequestType())&&request.getNumber()<=2){
			System.out.println(name+":"+request.getRequestType()+"" +
					" ����"+request.getNumber()+" ����׼");
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
		if("���".equals(request.getRequestType())&&request.getNumber()<=5){
			System.out.println(name+":"+request.getRequestType()+"" +
					" ����"+request.getNumber()+" ����׼");
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
		if("���".equals(request.getRequestType())){
			System.out.println(name+":"+request.getRequestType()+"" +
					" ����"+request.getNumber()+" ����׼");
		}else if("��н".equals(request.getRequestType())&&request.getNumber()<=500){
			System.out.println(name+":"+request.getRequestType()+"" +
					" ����"+request.getNumber()+" ����׼");
		}else if("��н".equals(request.getRequestType())&&request.getNumber()>500){
			System.out.println(name+":"+request.getRequestType()+"" +
					" ����"+request.getNumber()+" ��˵�ɣ�");
		}
	}
}