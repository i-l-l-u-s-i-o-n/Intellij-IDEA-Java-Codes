
// Created by Shivam Shukla.
// When no access scpecifier is specified, it is "default".
// default methods, classes, instance variable are only accessible when in same package .

import pack1.*;

class Main{
	public static void main (String [] args){
		
		A a =new A(10);              // Since A.java is in different package, so It will give an compile time error.
		
		System.out.println("Count value : "+ a.count);
		
	}
}

// OUTPUT-> 

//Main.java:9: error: cannot find symbol
//          A a =new A(10);