package zx.interpreter.test2;

public abstract class AbstractExpression {
	
	//解释器
	public void interpret(PlayContext context){
		if(context.getText().length()==0){
			return ;
		}else{
			/**
			 * 例如 O 3 E 0.5 G 0.5 A 3
			 * 则playKey为O playValue为3 
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
 * Description:音符类
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
			case 1:scale="低音";break;
			case 2:scale="中音";break;
			case 3:scale="高音";break;
			default:break;
		}
		System.out.print(scale+" ");
	}
	
}

/**
 * 
 * @author zhu_xiang 
 * Description:T代表速度，以毫秒为单位，T 1000 表示每节拍1秒，T 500表示每节拍半秒
 */
class Speed extends AbstractExpression{

	@Override
	public void execute(String playKey, double playValue) {
		String speed;
		if(playValue<500){
			speed="快速";
		}else if(playValue>=1000){
			speed="慢速";
		}else{
			speed="中速";
		}
		System.out.print(speed+" ");
	}
	
}
