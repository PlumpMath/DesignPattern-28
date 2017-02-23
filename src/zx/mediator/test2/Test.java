package zx.mediator.test2;

public class Test {
	
	public static void main(String[] args) {
		UnitedNationsSecurityCouncil unitedNationsSecurityCouncil = new UnitedNationsSecurityCouncil();
		
		USA c1 = new USA(unitedNationsSecurityCouncil);
		Irap c2 = new Irap(unitedNationsSecurityCouncil);
		
		unitedNationsSecurityCouncil.setColleague1(c1);
		unitedNationsSecurityCouncil.setColleague2(c2);
		
		c1.declare("不准研制核武器，否则发动战争");
		c2.declare("我们没有研制核武器，也不怕侵略");
		
	}

}
