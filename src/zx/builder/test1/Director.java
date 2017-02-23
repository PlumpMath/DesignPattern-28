package zx.builder.test1;

public class Director {
	
	public void Construct(Builder builder){
		builder.BuildPartA();
		builder.BuildPartB();
	}

}
