

// Created by Shivam Shukla.

// Class variable -> 
//The methods and variable which are defined with 'static' keyword are called CLASS Methods class variable respectively.

//Instance variable ->
//All the variables or methods defined in a class without static keyword is called instance variable.

class Circle{
	static int circleCount=0;
	int r;
	Circle(){
		r=10;
	}
	Circle(int r){
		this.r=r;
	}
	void area(){
		System.out.println("Area : "+3.14*r*r);
	}
	static void area(int r){
		System.out.println("Area : "+3.14*r*r);
	}
}

public class static_keyword{
	
	
	
	public static void main(String[] args){
		Circle c=new Circle();
		Circle c1=new Circle(15);
		c.area();
		c1.area();
		
		Circle.area(10);
		
	}
	static{
		System.out.println("This will print first as it is in static block!");
		}
}
		
		
		

	
	