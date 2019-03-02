
// Created by Shivam Shukla.

import pack1.*;

public class Main extends X{
	public static void main(String[] args){
		
		Main m=new Main();
		
		//System.out.println("a :"+m.a);			// Main.java:9: error: a is not public in X; cannot be accessed from outside package
		
		//System.out.println("b :"+m.b);			// Main.java:10: error: b has private access in X
		
		System.out.println("c :"+m.c);
		
		System.out.println("d :"+m.d);
		
		m.show();
	}
}