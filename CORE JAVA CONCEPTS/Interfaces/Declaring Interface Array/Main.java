
// Created by Shivam Shukla.

	
interface Shape{	
	void area();
}

class Rectangle implements Shape{
	
	int l,b;
	
	public Rectangle(int a,int c){
		l=a;
		b=c;
	}
	public void area(){
		System.out.println("Area of Rectangle : "+l*b);
	}
}


class Square implements Shape{
	
	int x;
	
	public Square(int a){
		x=a;
	}
	public void area(){
		System.out.println("Area of Square : "+x*x);
	}
	
}


		
public class Main{

	
	public static void main(String[] args){
		
		
		// Declaring array of Shape type.
		Shape shape[]= new Shape[2];
		
		shape[0]=new Rectangle(5,10);
		shape[1]=new Square(5);
		
		for(int i=0;i<shape.length; i++){
			
			shape[i].area();
			
		}
		
	}
	
	
}


// OUTPUT ->
/*

Area of Rectangle : 50
Area of Square : 25

*/


	
	
	
	