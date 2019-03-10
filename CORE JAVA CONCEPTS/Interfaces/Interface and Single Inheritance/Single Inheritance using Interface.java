
// Created by Shivam Shukla.

interface A{
	
	int x=100;
	
	// Common method as in B.
	void hello();
}

// Interface can't implement another interface, It can only inherit.
interface B extends A{
	
	int y=250;
	
	// Common method as in A.
	void hello ();
}


// Single inheritance using interface.
class Single_Inheritance implements B{
	
	
	//==========================================================================================================================//
	// 																															//
	// If the class doesn't override hello(), it will give an error as hello() is in both interface . So there will be ambiguity// 
	// to implement which version.																								//
	// But here, the Single_Inheritance class's version of hello() will execute ........										//
	//																															//
	//==========================================================================================================================//


	public void hello(){
		System.out.println("Hello from Single_Inheritance class");
	}
	
	public void sum(){
		System.out.println("Sum ( x+y) : "+(x+y));
	}
	
}
		
class Main{
	
	public static void main(String[] args){
		
		Single_Inheritance s=new Single_Inheritance();
		
		s.hello();
		s.sum();
		
	}
}

	
	
	
	
	
	