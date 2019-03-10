
// Created by Shivam Shukla.

class A{
	
	int x=100;
	
	public void helloFromA(){
		System.out.println("Hello from Class A");
	}
}

interface B{
	
	int y=250;
	
	void helloFromB();
}

interface C{
	
	int z=250;
	
	void helloFromC();
}

// Multiple inheritance using interface.
class Multiple_Inheritance extends A implements B,C{
	
	
	public void helloFromB(){
		System.out.println("Hello from Interface B");
	}
	
	public void helloFromC(){
		System.out.println("Hello from Interface C");
	}

	public void helloFromClass(){
		super.helloFromA();
		helloFromB();
		helloFromC();
		System.out.println("Hello from Multiple_inheritance class");
	}
	
	public void sum(){
		System.out.println("Sum ( x+y) : "+(x+y));
	}
}
		
public class Main{
	
	
	public static void main(String[] args){
		
		Multiple_Inheritance m=new Multiple_Inheritance();
		
		m.helloFromClass();
		m.sum();
		
		
	}
	
	
}

// OUTPUT ->

/*

Hello from Class A
Hello from Interface B
Hello from Multiple_inheritance class
Sum ( x+y) : 350

*/


	
	
	
	
	
	