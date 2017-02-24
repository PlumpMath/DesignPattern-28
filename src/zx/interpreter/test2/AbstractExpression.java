package zx.interpreter.test2;

public abstract class AbstractExpression {
	
	//������
	public void interpret(PlayContext context){
		if(context.getText().length()==0){
			return ;
		}else{
			/**
			 * ���� O 3 E 0.5 G 0.5 A 3
			 * ��playKeyΪO playValueΪ3 
			 */
			String playKey=context.getText().substring(0,1);
			context.setText(context.getText().substring(2));
			double playValue=Double.valueOf(
					context.getText().substring(0, context.getText().indexOf(" ")));
			context.setText(context.getText().substring(
					context.getText().indexOf(" ")+1));
			execute(playKey,playValue);
			
		}
	}

	public abstract void execute(String playKey, double playValue); 

}

/**
 * @author zhu_xiang 
 * Description:������
 */
class Note extends AbstractExpression{

	@Override
	public void execute(String playKey, double playValue) {
		String note="";
		switch(playKey){
			case "C":note="1";break;
			case "D":note="2";break;
			case "E":note="3";break;
			case "F":note="4";break;
			case "G":note="5";break;
			case "A":note="6";break;
			case "B":note="7";break;
			default:break;
		}
		System.out.print(note+" ");
	}
}

class Scale extends AbstractExpression{

	@Override
	public void execute(String playKey, double playValue) {
		String scale="";
		switch((int)playValue){
			case 1:scale="����";break;
			case 2:scale="����";break;
			case 3:scale="����";break;
			default:break;
		}
		System.out.print(scale+" ");
	}
	
}

/**
 * 
 * @author zhu_xiang 
 * Description:T�����ٶȣ��Ժ���Ϊ��λ��T 1000 ��ʾÿ����1�룬T 500��ʾÿ���İ���
 */
class Speed extends AbstractExpression{

	@Override
	public void execute(String playKey, double playValue) {
		String speed;
		if(playValue<500){
			speed="����";
		}else if(playValue>=1000){
			speed="����";
		}else{
			speed="����";
		}
		System.out.print(speed+" ");
	}
	
}
