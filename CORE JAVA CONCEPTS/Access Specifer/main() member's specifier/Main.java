
// Created by Shivam Shukla.
class A{
	int c=5;	
}

public class Main{
	public static void main(String [] args){
		
		// main() must contains all members to be "DEFAULT".
		// No other access specifier is allowed for the members of tha main().
		
		//public int count=10;         // It will give an error.
		
		int count=10;                // It will work as access specifier is default.
		
		System.out.println("Count : "+count);
		
		A a=new A();
		
		System.out.println("Count : "+a.c);
	}
}