package zx.interpreter.test1;

public abstract class AbstractExpression {
	/**
	 * 声明一个抽象的解释操作
	 * @param context
	 */
	public abstract void interpret(Context context);

}

class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("终端解释器");
	}
}

class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("非终端解释器");
	}
}
