
// Created by Shivam Shukla.
// Protected members of a class can be accessed be the child class of that class.

class A{
	
	private int i=10;
	
	protected int j=20;

	A(int i,int j){
		this.i=i;
		this.j=j;
	}
}
class Inheritance_Example extends A{
	
	
	Inheritance_Example(int i,int j){
		super(i,j);
	}
	
	
	public static void main(String[] ar){
		
		Inheritance_Example test=new  Inheritance_Example(30,40);
		
		//System.out.println(" i : "+ test.i);  // Gives compile time error.
		
		System.out.println(" j : "+ test.j);
	}
}