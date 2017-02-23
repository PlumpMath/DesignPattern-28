package zx.decorator.test1;

public abstract class Finery {

	public abstract void show();
}

class TShirts extends Finery {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("¥ÛT–Ù");
	}

}

class BigTrouser extends Finery {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("¥Ûø„Ò√");
	}

}
