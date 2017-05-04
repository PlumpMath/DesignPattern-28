package zx.visitor.test1;

import java.util.ArrayList;

public class Test {
	
	public static void main(String[] args) {
		ArrayList<Person> persons = new ArrayList<Person>();
		
		Man man1 = new Man();
		man1.action="³É¹¦";
		persons.add(man1);
		Woman woman1 = new Woman();
		woman1.action="³É¹¦";
		persons.add(woman1);
		
		Man man2 = new Man();
		man2.action="Ê§°Ü";
		persons.add(man1);
		Woman woman2 = new Woman();
		woman2.action="Ê§°Ü";
		persons.add(woman1);
		
		Man man3 = new Man();
		man3.action="Áµ°®";
		persons.add(man3);
		Woman woman3 = new Woman();
		woman3.action="Áµ°®";
		persons.add(woman3);
		
		for(Person p:persons){
			p.getConclusion();
		}
		
	}

}
