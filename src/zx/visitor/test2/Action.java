package zx.visitor.test2;

public abstract class Action {
	
	//得到男人结论或反映
	public abstract void getManConclusion(Man concreteElementA);
	//得到女人结论或反映
	public abstract void getWomanConclusion(Woman concreteElementB);
}

class Success extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"时，背后多半有一个伟大的女人");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"时，背后多半有一个不成功的男人");
	}
}

class Failing extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"时，闷头喝酒，谁都不用劝");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"时，眼泪汪汪，谁也劝不了");
	}
}

class Amativeness extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"凡是不懂也要装懂");
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"遇事懂也装不懂");
	}
	
}

class Marriage extends Action{

	@Override
	public void getManConclusion(Man concreteElementA) {
		System.out.println(concreteElementA.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"感慨道：恋爱游戏终结时，‘有妻徒刑’遥无期");
		
	}

	@Override
	public void getWomanConclusion(Woman concreteElementB) {
		System.out.println(concreteElementB.getClass().getSimpleName()+" "
				+this.getClass().getSimpleName()+"爱情长跑路漫漫，婚姻保险保平安");
	}
	
}