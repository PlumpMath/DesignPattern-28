package zx.mediator.test2;

public class Test {
	
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unitedNationsSecurityCouncil = new UnitedNationsSecurityCouncil();
		
		USA c1 = new USA(unitedNationsSecurityCouncil);
		Irap c2 = new Irap(unitedNationsSecurityCouncil);
		
		unitedNationsSecurityCouncil.setColleague1(c1);
		unitedNationsSecurityCouncil.setColleague2(c2);
		
		c1.declare("��׼���ƺ����������򷢶�ս��");
		c2.declare("����û�����ƺ�������Ҳ��������");
		
	}

}
