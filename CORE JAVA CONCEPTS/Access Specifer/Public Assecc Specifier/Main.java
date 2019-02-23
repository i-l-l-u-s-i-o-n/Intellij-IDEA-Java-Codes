
// Created by Shivam Shukla.

// When no access scpecifier is specified, it is "default".
// public methods, classes, instance variable are accessible in different package also .

import pack1.*;

public class Main{
	public static void main (String [] args){
		
		A a =new A(10);              
		
		System.out.println("Count value : "+ a.count);
		
	}
}

// OUTPUT-> 

// Count value : 10