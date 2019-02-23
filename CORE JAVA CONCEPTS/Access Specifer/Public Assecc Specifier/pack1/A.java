
// Created by Shivam Shukla.

package pack1;

public class A{
	
	//int count=5;                         // It wiil give an error as the variable is still default , so can't be accessed from other package.
	
	public int count=5;                 // We must make variables and methods "public" , even if the class is public!
	
	public A(int c){					// Constructor should also have to be PUBLIC!!
		count=c;
	}
}