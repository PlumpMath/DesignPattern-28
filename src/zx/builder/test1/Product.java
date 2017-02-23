package zx.builder.test1;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> parts=new ArrayList<String>();
    
    public void Add(String part){
    	parts.add(part);
    }
    
    public void show(){
    	System.out.println("产品创建");
    	for(String part:parts){
    		System.out.println(part);
    	}
    }

}
