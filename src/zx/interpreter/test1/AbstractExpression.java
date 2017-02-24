package zx.interpreter.test1;

public abstract class AbstractExpression {
	/**
	 * ����һ������Ľ��Ͳ���
	 * @param context
	 */
	public abstract void interpret(Context context);

}

class TerminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("�ն˽�����");
	}
}

class NonterminalExpression extends AbstractExpression{

	@Override
	public void interpret(Context context) {
		System.out.println("���ն˽�����");
	}
}
