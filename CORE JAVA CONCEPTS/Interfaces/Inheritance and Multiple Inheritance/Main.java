
// Created by Shivam Shukla.

interface A{
	
	int x=100;
	
	void helloFromA();
}

// Interface can't implement another interface, It can only inherit.
interface B{
	
	int y=250;
	
	void helloFromB();
}

// Multiple inheritance using interface.
class Multiple_Inheritance implements A,B{
	
	public void helloFromA(){
		System.out.println("Hello from Interface A");
	}
	
	public void helloFromB(){
		System.out.println("Hello from Interface B");
	}

	public void helloFromClass(){
		System.out.println("Hello from Multiple_Inheritance class");
	}
	
	public void sum(){
		System.out.println("Sum ( x+y) : "+(x+y));
	}
	
}
		
public class Main{
	
	
	public static void main(String[] args){
		
		Multiple_Inheritance m=new Multiple_Inheritance();
		
		m.helloFromA();
		m.helloFromB();
		m.helloFromClass();
		m.sum();
		
		
	}
	
	
}

// OUTPUT ->

/*

Hello from Interface A
Hello from Interface B
Hello from Multiple_Inheritance class
Sum ( x+y) : 350

*/


	
	
	
	
	
	