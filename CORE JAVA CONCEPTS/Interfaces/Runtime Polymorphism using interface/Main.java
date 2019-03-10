
// Created by Shivam Shukla.

	
interface A{
	int x=100;
	
	void hello();
}
		
public class Main implements A{
	
	
	public void hello(){
		System.out.println("Hello from Main class .");
	}
	
	public static void main(String[] args){
		
		Main m=new Main();
					
		A a;   // a is of type A interface.
		
		a=m;   // Assigning a , the reference of m.
		
		
		// Runtime Polymorphism.
		a.hello();  // Main class method will execute.
		
		
	}
	
	
}


	
	
	
	