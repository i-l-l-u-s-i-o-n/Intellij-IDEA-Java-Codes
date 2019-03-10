
// Created by Shivam Shukla.

public class Main{
	
	
	public static void main(String[] args){
		
	
		//A a=new A();                    // ERROR - > Objects ca't be instantiated.
										  // We are calling the constructor for A, but there is no constructor for interface A.
	
		A a1;                             // Declaration is perfectly fine.

		A a2[]=new A[5];                  // Creating array of A type is also perfectly fine .
		
	}
}
	 
	