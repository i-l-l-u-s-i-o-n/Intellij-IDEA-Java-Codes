
// Created by Shivam Shukla.

// Protected members can be accessed within same package.


class A{
	protected int c;
	protected A(int c){
		this.c=c;
	}
	
}

class Main{
	public static void main(String [] args){
		
		A a=new A(15);
		
		System.out.println("Count : "+a.c);
	}
}