package zx.factorymethod.test2;

public interface IFactory {
	LeiFeng createLeiFeng();
}

class UnderGraduateFactory implements IFactory{
	@Override
	public LeiFeng createLeiFeng() {
		return new UnderGraduate();
	}
}

class VolunteerFactory implements IFactory{
	@Override
	public LeiFeng createLeiFeng() {
		return new Volunteer();
	}
}

