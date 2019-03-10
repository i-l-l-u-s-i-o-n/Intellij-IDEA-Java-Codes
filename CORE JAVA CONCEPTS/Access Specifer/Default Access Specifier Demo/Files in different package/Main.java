
// Created by Shivam Shukla.

// When no access scpecifier is specified, it is "default".
// default methods, classes, instance variable are only accessible when in same package .
// Classes can be in different files.

import pack1.*;

class Main{
	public static void main (String [] args){
		
		A a =new A(10);             // Since class A is in different package.         
		
		System.out.println("Count value : "+ a.count);
		
	}
}


/*
Compilation Error.

Main.java:12: error: cannot find symbol
                A a =new A(10);
                ^
  symbol:   class A
  location: class Main
Main.java:12: error: cannot find symbol
                A a =new A(10);
                         ^
  symbol:   class A
  location: class Main
2 errors
*/

