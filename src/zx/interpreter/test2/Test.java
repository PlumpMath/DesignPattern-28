package zx.interpreter.test2;

public class Test {
	
	public static void main(String[] args) {
		PlayContext playContext = new PlayContext();
		System.out.println("ÉÏº£Ì²£º ");
		playContext.setText("T 1000 O 2 E 0.5 G 0.5 A 3 E 0.5 G 0.5 D 3 E 0.5 "
				+ "G 0.5 A 0.5 O 3 C 1 O 2 A 0.5 G 1 C 0.5 E 0.5 D 3 ");
		AbstractExpression expression=null;
		
		try {
			while(playContext.getText().length()>0){
				String str=playContext.getText().substring(0,1);
				switch(str){
				case "T":expression=new Speed();break;
				case "O":expression=new Scale();break;
				case "C":
				case "D":
				case "E":
				case "F":
				case "G":
				case "A":
				case "B":expression=new Note();break;
				default:break;
				}
				expression.interpret(playContext);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
