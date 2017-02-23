package zx.compositepattern.test2;

public class Test {
	
	public static void main(String[] args) {
		ConcreteCompany root = new ConcreteCompany("�����ܹ�˾");
		root.add(new HRDepartment("�ܹ�˾������Դ��"));
		root.add(new FinanceDepartment("�ܹ�˾����"));
		
		ConcreteCompany comp = new ConcreteCompany("�Ϻ������ֹ�˾");
		comp.add(new HRDepartment("�����ֹ�˾������Դ��"));
		comp.add(new FinanceDepartment("�����ֹ�˾����"));
		root.add(comp);
		
		ConcreteCompany comp1 = new ConcreteCompany("�Ͼ����´�");
		comp1.add(new HRDepartment("�Ͼ����´�������Դ��"));
		comp1.add(new FinanceDepartment("�Ͼ����´�����"));
		comp.add(comp1);
		
		ConcreteCompany comp2 = new ConcreteCompany("���ݰ��´�");
		comp2.add(new HRDepartment("����������Դ��"));
		comp2.add(new FinanceDepartment("���ݲ���"));
		comp.add(comp2);
		
		System.out.println("===�ṹͼ===");
		root.display(1);
		
		System.out.println("=======ְ��======");
		root.lineOfDuty();
		
	}
}
