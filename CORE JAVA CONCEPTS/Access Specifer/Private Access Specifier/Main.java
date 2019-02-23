
// Created by Shivam Shukla.
class A{
	private int c=5;
	
	// If constructor is private, we can't create object for the class.
	private A(){            
		System.out.println("Private constructor");
	}
	
	
	// We can use our private constructor in many ways ->
	A(int c){
		this();   // Calling the private constructor.
		this.c=c;
	}
	
	int get_c(){
		return c;
	}
}

public class Main{
	public static void main(String[] args){
		
		//A a=new A();               // Compile time error.
		
		A a1=new A(10);
		
		System.out.println("Count : "+a1.get_c());
		
	}
}
	